package ch8;

public class Car {
//필드 => 객체 클래스 타입이 필드 => null로
	Tire frontLeftTire = new Tire(6, "앞왼쪽"); // 앞쪽 왼쪽 바퀴
	Tire frontRightTire = new Tire(2, "앞오른쪽");// 앞쪽 오른쪽 바퀴
	Tire backLeftTire = new Tire(3, "뒤왼쪽");// 뒤쪽 왼쪽
	Tire backRightTire = new Tire(4,"뒤오른쪽");// 뒤쪽 오른쪽

	int run() {
		System.out.println("자동차가 달립니다.");
		if (!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if (!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if (!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if (!backRightTire.roll()) {
			stop();
			return 4;
		}

		return 0;
	}

	void stop() {

		System.out.println("자동차가 멈춥니다.");
	}
}
