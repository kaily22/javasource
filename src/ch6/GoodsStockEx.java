package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		// 객체 생성
		GoodsStock goods1 = new GoodsStock("p210215", 100);

		// 메소드 호출
		goods1.addStock(20);

		// 재고수량 확인
		System.out.println("재고 수량 : " + goods1.getCount());

		goods1.subtractStock(40);
		System.out.println("재고 수량 : " + goods1.getCount());

		GoodsStock goods2 = new GoodsStock("p210216", 0);

		goods2.addStock(100);
		System.out.println("재고수량 :" + goods2.getCount());

		goods2.subtractStock(30);
		System.out.println("재고수량 :" + goods2.getCount());

	}

}
