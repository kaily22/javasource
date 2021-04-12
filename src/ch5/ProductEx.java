package ch5;

public class ProductEx {

	public static void main(String[] args) {
	
	//상품 객체 생성 -> 힙 메모리에 올라간다.
	Product product1 = new Product("1234", "가방","나이키",30000);
	
	//할인율 변경
	product1.changeDis(15);
	System.out.println("변경된 할인율 : " +product1.discount);
	
	//판매가 확인
	
	System.out.println("판매가 : " +product1.cost());
	
	
	
	
	
	
	
	
	

	}

}
