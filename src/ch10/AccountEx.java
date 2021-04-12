package ch10;

public class AccountEx {

	public static void main(String[] args) {
		// Cannot instantiate the type Account

		Account account = new CheckingAccount();
		CheckingAccount checking = new CheckingAccount();

		Account account2 = new Account() {

			// 익명 구현
			@Override
			public void test() {
				System.out.println("test");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		
		account2.test();
		account2.print();

	}

}
