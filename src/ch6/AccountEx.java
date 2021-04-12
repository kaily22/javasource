package ch6;

public class AccountEx {

	public static void main(String[] args) {
	//account2 객체 생성  - 기본 생성자로 
	Account2 acc2 = new Account2();
	
	//잔setBalance를 이용해 잔액 변경하기 => 10000
	//현재 잔고 출력하기 : getBalance() 이용
	
	acc2.setBalance(10000);
	System.out.println("현재 잔고 : " +acc2.getBalance());
	
	//setBalance를 이용해 잔액 변경하기 => -100 으로 
	//setBalalnce =>2000000
	//현재 잔고 출력
	acc2.setBalance(-100);
	System.out.println("현재 잔고 : " +acc2.getBalance());
	
	acc2.setBalance(2000000);
	System.out.println("현재 잔고 : " +acc2.getBalance());
	
	//다시 3000000변경
	//현재 잔고 출력하기
	acc2.setBalance(3000000);
	System.out.println("현재 잔고 : " +acc2.getBalance());
	}

}
