package ch6;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// 객체 생성
		GoodsStock2 goods1 = new GoodsStock2();
		// goods1.code =""; //x
		goods1.setCode("p210125");
		goods1.setCount(100);
		// 메소드 호출
		goods1.addStock(20);

		// 재고수량 확인
		System.out.println(goods1.getCode() + "재고 수량 : " + goods1.getCount());

		goods1.subtractStock(40);
		
		System.out.println(goods1.getCode() + "재고 수량 : " + goods1.getCount());

	}

}
