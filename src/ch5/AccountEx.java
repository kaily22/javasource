package ch5;

public class AccountEx {

	public static void main(String[] args) {
	
	Account account1 = new Account("1002-355-187355", "이승현", 10000);
	
	//입금한다 void-> 호출만 가능
	account1.deposit(3000);
	System.out.println("잔액 확인 : " +account1.balance);
	//1번 sys구문 넣어서 바로 실행
	System.out.println("잔액 확인:"  +account1.withdraw(30));
	//2번 실행하기
    //int balance =  account1.withdraw(0);	
    // sysout("잔액 확인 :" +balance);
	}

}
