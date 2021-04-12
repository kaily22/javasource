package ch5;

public class Card {
//속성 - 숫자, 종류(다이아, 스페이드, 클로버, 하트), 너비
//필드(인스턴스 변수, 프로퍼티, 멤버변수)
	
	int num;
	String kind;
	
	//공통된 속성 -> 정적필드(고정된 형태) , ex에서 new필요 x
	static int width=100;
	static int height=100; 

//생성자
	
	public Card(int num, String kind) {
		super();
		this.num = num;
		this.kind = kind;
	
	}



}
