package ch6;

public class GoodsStock2 {
//상품 재고 관리를 위한 클래스
//속성 - 상품코드(p210135), 재고수량(100)

	private String code;
	private int count;

//기능 - 재고를 더한다. 재고를 뺀다.

	void addStock(int amount) {
		count += amount;
	}

	void subtractStock(int amount) {
	    if(count>amount) {
		count -= amount;
	    }
	}
	
	//setter 메소드
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	//getter 메소드
	
	public String getCode() {
		return code;
	}
	public int getCount() {
		return count;
	}
	
}
