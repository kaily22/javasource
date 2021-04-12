package ch5;
public class Account {
//은행 계좌 클래스
//속성 -계좌번호, 이름, 잔액

	 String num;
	 String name;
	 int balance;

//생성자 -기본 생성자, 인자(속성 모두 초기화 가능)

////	Account() {}
////	Account(String num, String name, int balance) {
////		this.num = num;
////		this.name = name;
////		this.balance = balance;
////	}
//
//	

	public Account() {
		super();
	}

	public Account(String num, String name, int balance) {
		super();
		this.num = num;
		this.name = name;
		this.balance = balance;
	}

////메소드 - 입금한다.출금한다.
	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount ) {
		balance -= amount;
		return balance;
	}
 
}
