package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);

		while (isStop) {
			System.out.println("======== 회원 관리 프로그램 ======");
			System.out.println("1.회원등록");
			System.out.println("2.특정 회원 조회");
			System.out.println("3.전체 회원 조회");
			System.out.println("4.회원수정");
			System.out.println("5.회원탈퇴");
			System.out.println("6.프로그램 종료");
			System.out.println("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.print("회원 이름 입력 >> ");
				String userName = sc.nextLine();
				System.out.println("생일 입력 >> ");
				int birthYear = Integer.parseInt(sc.nextLine());
				System.out.print("주소 입력 >> ");
				String addr = sc.nextLine();
				System.out.print("핸드폰 번호 입력>>");
				String mobile = sc.nextLine();

				UserAddService addservice = new UserAddService();
				boolean isAdd = addservice.add(userName, birthYear, addr, mobile);
				System.out.println(isAdd ? "입력 성공" : "입력 실패");

				break;
			case 2:
				System.out.println("회원 번호 입력 >> ");
				int no = Integer.parseInt(sc.nextLine());

				UserSelectOneService selectoneService = new UserSelectOneService();
				UserVO vo = selectoneService.getUser(no);
				System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
				System.out.print(vo.getNo() + "\t");
				System.out.print(vo.getUsername() + "\t");
				System.out.print(vo.getBirthYear() + "\t");
				System.out.print(vo.getAddr() + "\t");
				System.out.print(vo.getMobile() + "\n");
				break;
			case 3:
				UserSelectAllService allservice = new UserSelectAllService();
				List<UserVO> list = allservice.listAll();

				System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
				for (UserVO vo1 : list) {
					System.out.print("no : " + vo1.getNo() + "\t");
					System.out.print("Username : " + vo1.getUsername() + "\t");
					System.out.print("birthYear : " + vo1.getBirthYear() + "\t");
					System.out.print("Addr : " + vo1.getAddr() + "\t");
					System.out.print("mobile : " + vo1.getMobile() + "\n");
				}

				break;
			case 4:

				break;
			case 5:
				System.out.println("삭제할 사원번호 입력 : ");
				no = Integer.parseInt(sc.nextLine());
				UserDeleteService deleteservice = new UserDeleteService();
				boolean isDelete = deleteservice.removeUser(no);
				System.out.println(isDelete ? "탈퇴 성공" : "탈퇴 실패");
				break;
			case 6:
				System.out.println("프로그램 종료");
				isStop = false;
				break;

			default:
				break;
			}

		}

	}
}
