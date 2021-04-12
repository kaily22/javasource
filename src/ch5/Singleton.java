package ch5;

public class Singleton {

	private static Singleton singleton;
	//객첼를 여러번 만든다해도 동일한 객체이다.

	private Singleton() {
	//외부에서 new 연산자로 생성자 호출 받기
	// private : 외부에서 new연산자로 객체 생성 할 수 x
	
	}
	
	static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(); //객체 생성
		}
		return singleton;
	}
}
