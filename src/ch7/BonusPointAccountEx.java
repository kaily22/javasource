package ch7;



public class BonusPointAccountEx {

	public static void main(String[] args) {

		BonusPointAccount obj = new BonusPointAccount("111-222", "이승현", 20000, 300);
		obj.deposit(3000);
		System.out.println("포인트 : " + obj.getBonus());

	}

}
