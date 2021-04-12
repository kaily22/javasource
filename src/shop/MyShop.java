package shop;

import java.util.Scanner;

public class MyShop implements Ishop {
	private String title;
	Scanner sc = new Scanner(System.in);
	// carts 장바구니
	Product[] carts = new Product[5];
	Product[] products = new Product[5];

	User[] users = new User[2];
//  선택된 유저값 담기
	String selUser;

	@Override
	public void setTitle(String title) { // 멤버 변수 변경
		this.title = title;

	}

	@Override
	public void genUser() {
		// user 2명 생성(여러명 -> 배열 사용)
//		User user1 = new User("홍길동" ,PayType.CARD); //new User 무조건
//		User user2 = new User("성춘향" ,PayType.CASH);
//	 
//	    users[0] = user1;
//	    users[1] = user2;

		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		// 제품 생성(왼쪽이 부모가 오게 하는게 편리)

		products[0] = new CellPhone("갤럭시", 1000000, "SKT");
		products[1] = new CellPhone("LGX-500", 1000000, "KT");
		products[2] = new CellPhone("아이폰12", 1000000, "LG");
		products[3] = new SmartTV("삼성", 20000000, "4K");
		products[4] = new SmartTV("LG스마트", 20000000, "1080p");

	}

	@Override
	public void start() {
		System.out.println(title + ": 메인 화면 - 계정 선택");
		System.out.println("===========================");
//		for(int i=0; i<users.length;i++) { //배열 출력할땐 for문!!
//		   System.out.printf("[%d] %s(%s)\n", i, users[i].getName(),users[i].getPayType());
//		}
		int i = 0;
		for (User user : users) {
			System.out.printf("[%d] %s(%s)\n", i++, user.getName(), user.getPayType());
		}
		System.out.println("[X] 종료");
		System.out.print("선택: ");
		String num = sc.nextLine();
		switch (num) {
		case "0":case "1":
			System.out.println("## " + num + "선택 ##");
			selUser = num;
			productList();
			break;
		case "X":
		case "x":
			System.out.println(title + "을 종료합니다.");
			break;
		default:
			System.out.println("\n메뉴를 확인해주세요\n");
			start();
			break;
		}

	}

	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택");
		System.out.println("===========================");
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]제품명:%s\n", i++);
			product.printDetail();
		}

		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택: ");
		String num = sc.nextLine();

		switch (num) {

		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		case "0":case "1":case "2":case "3":case "4":
			for (i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(num)];
				break;
				}
			}
				productList();
				break;
		default:
			productList();
			break;
		}
	}

	public void checkOut() {
		System.out.println(title + ": 체크아웃");
		System.out.println("===========================");
		int i = 0;
		int sum = 0;
		for (Product c : carts) {
			if (c != null) {
				System.out.printf("[%d]%s(%d)\n", i++, c.getPname(), c.getPrice());
				sum += c.getPrice();
			}
		}
		System.out.println("===========================");
		System.out.println("결제 방법: " + users[Integer.parseInt(selUser)].getPayType());
		System.out.println("합계 : " + sum);
		System.out.println("[p]이전,  [q]결제 완료");
		System.out.println("선택 : ");
		String num = sc.nextLine();

		switch (num) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제 완료 되었습니다.");
			break;
		default:
			checkOut();
			break;
		}

		// input => p : 이전 화면 => 상품 목록 보여주기
		// q : 결제완료 되었습니다. 메세지 출력 후 종료
		// 다른 입력 : checkOut호출

	}
}

//		CellPhone[] phones = new CellPhone[3];
//		CellPhone cellphone1 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone2 = new CellPhone("갤럭시", 1000000, "SKT");
//		CellPhone cellphone3 = new CellPhone("갤럭시", 1000000, "SKT");
//		
//		phones[0] = cellphone1;
//		phones[1] = cellphone2;
//		phones[2] = cellphone3;
//		
//		SmartTV smartTV1 = new SmartTV("삼성", 20000000, "4K");
//		SmartTV smartTV2 = new SmartTV("삼성", 20000000, "4K");
//		
//		Product pro1 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro2 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro3 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro4 = new CellPhone("갤럭시", 1000000, "SKT");
//		Product pro5 = new CellPhone("갤럭시", 1000000, "SKT");