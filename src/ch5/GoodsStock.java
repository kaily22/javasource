package ch5;

public class GoodsStock {
//상품 재고 관리를 위한 클래스
//속성 - 상품코드(p210135), 재고수량(100)

	private String code;
	private int count;

//생성자 -기본 생성자, 인자를 받는 생성자(상품 코드만 받는/상품코드와 재고수량 받는)

	public GoodsStock() {
	}

	public GoodsStock(String code) {
		this.code = code; // 내 코드를 넘어오는 값으 코드
	}

	public GoodsStock(String code, int count) {
		this.code = code;
		this.count = count;
	}

//기능 - 재고를 더한다. 재고를 뺀다.

	void addStock(int amount) {
		count += amount;
	}

	void subtractStock(int amount) {
	    if(count>amount) {
		count -= amount;
	    }
	}
	public String getCode() {
		return code;
	}
	public int getCount() {
		return count;
	}
	
}
