package ch8;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 Hankooktire로 교체");
				//Tire frontLeftTire = new Tire(6, "앞왼쪽");
				//Tire frontLeftTire = new HankookTire(6, "앞왼쪽");
				car.frontLeftTire = new HankookTire(15, "앞왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire(13, "앞오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire(14, "뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire(17, "뒤오른쪽");
				break;
			}
		System.out.println("----------------------------------------------");
			}

		}
	}

