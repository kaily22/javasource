package ch5;

public class AccountEx2 {
//jvm이 부르니깐 객체생성 없이 무조건 불러냄 => static=>1번으로 부른다.
	public static void main(String[] args) {

		Account account = new Account("1002-355-187355", "이승현", 10000);

		// 입금한다 void-> 호출만 가능
		account.deposit(50000);
		accountPrint(account);

		account.withdraw(30000);
		accountPrint(account);

		Account account2 = new Account("1234-5678-1090", "성춘향", 20000);
		
		account2.deposit(50000);
		accountPrint(account2);

		account2.withdraw(30000);
		accountPrint(account2);
	
	}
	static void accountPrint(Account obj) { //타입만 맞춰라
		System.out.println(obj.name + "잔액 확인 : " +obj.balance);

	}

}
