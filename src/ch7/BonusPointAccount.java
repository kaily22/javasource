package ch7;

public class BonusPointAccount extends Account {
//보너스 포인트 - 정수형태 
	private int bonus;

	public BonusPointAccount(String ano, String owner, int balance, int bonus) {
		super(ano, owner, balance);
		this.bonus = bonus;
	}
	
// deposit 오버라이딩 => 예금한다/보너스포인트 = 예금액의 1%
	@Override
	void deposit(int amount) {
		super.deposit(amount); //예금한다.
		bonus += (int)(amount * 0.01);//보너스 포인트 = 예금액의 1%
	    setBonus(bonus);
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}
}

