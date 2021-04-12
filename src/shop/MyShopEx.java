package shop;

public class MyShopEx {

	public static void main(String[] args) {

		MyShop myshop = new MyShop();
		// 상점 이름 지정
		myshop.setTitle("MyShop");
		// User 생성
		myshop.genUser();
		// 제품 생성
		myshop.genProduct();
		// 상점 시작
		myshop.start();
		
	}

}
