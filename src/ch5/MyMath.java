package ch5;
/*static
 * 멤버 변수 중 모든 인스턴스가 공동으로 사용하는 것에 붙임
 * 인스턴스(new)를 생성하지 않아도 쓸 수 있음
 * 인스턴스 변수/인스턴스 메소드 사용 x
 * 대부분 정적필드 선언과 동시에 초기화
 */

public class MyMath {

	//public static final double PI = 3.14;
	long a, b;
	
	//인스턴스 메소드 사용 불가

//메소드
	long add() {
		return a + b;
	}

	long sub() {
		return a - b;
	}

	long mul() {
		return a * b;
	}

	long divide() {
		return a / b;
	}

	// 정적 필드(클래스 변수)
	// 메소드에 static -> 정적 메소드(클래스메소드)
	static long add(long c, long d) {
		//sub(); x
		//int sum = a + b; x
		return c + d;
	}

	static long sub(long c, long d) {
		return c - d;
	}

	static long mul(long c, long d) {
		return c * d;
	}

	static double divide(double c, double d) {
		return c / d;
	}
}
