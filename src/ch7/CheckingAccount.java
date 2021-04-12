package ch7;

public class CheckingAccount extends Account {

	String cardNo;

public CheckingAccount(String ano, String owner, int balance, String cardNo) {
	super(ano,owner,balance);
	this.cardNo = cardNo;
}
	public int pay(String cardNo, int amount) {
		if (!this.cardNo.equals(cardNo) || super.getBalance() < amount) {
			System.out.println("지불 불가");
			return 0;
		}
//사용액을 지불
//super.setBalance(super.getBalance()-amount)
		return withdraw(amount);
	}
}