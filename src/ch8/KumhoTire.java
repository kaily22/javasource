package ch8;

public class KumhoTire extends Tire {
//부모가 default 없이
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	//부모가 넘겨준 거랑 다르게 => 오버라이딩(재정의)
	@Override
		public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");

			return true;
		} else {
			System.out.println("***" + location + "Kumho Tire 펑크 ***");
			return false;
		}
	}

}
