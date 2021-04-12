package shop;

public abstract class Product {
//추상 클래스 : 변수, 상수, 일반메소드, 추상메소드(추상클래스 만드는 이유: 추상메소드)

	private String pname;
	private int price;

//c=>생성자
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	abstract void printExtra();

	void printDetail() {
		// 기본 정보인 상품 이룸과 가격을 출력한다.
		System.out.println("상품 이름 : " + pname);
		System.out.println("가격 : " + price);

		printExtra(); // 호출

	}// 상세 정보를 출력하려고 printExtra() 메서드 호출
}
