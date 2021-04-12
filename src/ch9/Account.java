package ch9;

/* 추상클래스(abstract class)
 * 클래스 : 설계도
 * 추상 클래스 : 미완성 설계도(추상 메서드 포함)
 * 상속을 받는 하위 클래에스에서 반드시 추상 메소드는 구현을 해야함
 * 객체 생성 못함 => 생성자는 존재
 * 
 */
public abstract class Account {
//추상메소드가 하나 무조건 가지고 있기 때문에 클래스로 만듦
	String name; //일반 필드 ㅇ
	
	public Account() {
	System.out.println("Account 기본 생성자");
	}
	
	// 추상 메소드(구현 부분이 없음) => 상속받아서 구현해야함
	abstract void method1(); 
	void method2() {
	}

}
