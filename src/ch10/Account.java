package ch10;

/*인터페이스
 * 추상 클래스와 비슷함
 * 추상 클래스보다 추상화가 더 높음 => 추상 메소드와 상수만을 가짐
 * 다른 클래스를 작성하는데 도움 줄 목적으로 사용됨(뼈대만)
 * 모든 메서드는 public abstract 이어야 하면 생략 가능
 * 모든 멤버변수는 public static final 이어야 햐며 생략이 가능
 * 생성자 없음
 *
 * JDK8 인터페이스 변화 
 * 디폴트 메서드/정적 메서드
 * 
 * JDK9 인터페이스 변화
 * private 메소드
 */
public interface Account {
	static final int SPADE = 4;
	
//	Account() {} 생성자 자체를 만들 수 x
	
	
	void test(); // 안붙여도 추상 인식
	void print(); // 구현 부분 x
	default int method2() {
		return 0;
	}
	static void method() {
	
	}
}
