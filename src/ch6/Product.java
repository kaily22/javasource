package ch6;

public class Product {
//속성 - 상품 코드, 상품명, 제조사, 제조단가(int), 할인율

	private String code;
	private String name;
	private String company;
	private int price;
	private int discount;

//생성자 - 모든 필드를 파라미터로 받는 생성자/ 할인율을 뺀 나머지 필드 받기
	public Product(String code, String name, String company, int price, int discount) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
		this.discount = discount;
	}

	public Product(String code, String name, String company, int price) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
	}

//기능- 할인율 변경, 판매가(제조단가-할인율)계산
	void changeDis(int dis) {
		this.discount = dis;
	}
	public int getDiscount() {
		return discount;
	}
	

	int setPrice() {
		return price * (100 - discount) / 100;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
