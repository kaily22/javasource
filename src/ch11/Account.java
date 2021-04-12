package ch11;

public class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;

	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) { //강제로 exception실행
		 //throw  new Exception("잔고부족 : " +(money-balance)+" 부족함");
           throw new BalanceInsufficientException("잔고부족 : " +(money-balance)+" 부족함");
		}

		balance -= money;
	}

}
