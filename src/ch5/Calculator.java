package ch5;

public class Calculator { //속성없이 메소드만 가짐. 무조건 클래스
	void powerOn() { //void=>호출만 하면 끝
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		return x + y; //호출한 곳으로 되돌아가라 -> 80 int로
	}

	double divide(int x, int y) {
		return (double) (x / y);
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
