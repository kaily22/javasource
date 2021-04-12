package ch6;

public class Account2 { //클래스에는 proteced붙이지 x
//은행 계좌 클래스
//속성 -계좌번호, 이름, 잔액

	private int balance;
	final static int MIN_BALANCE =0;
	final static int MAX_BALANCE = 1000000;
	
	
//setter와 getter를 작성
// 0<=balance <=1000000 범위의 값을 가짐
// 0과 1000000은 Min_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
// setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
	  if(balance >= MIN_BALANCE && balance<=MAX_BALANCE) 
		this.balance = balance;
	}
	
}	


//////메소드 - 입금한다.출금한다.
//	void deposit(int amount) {
//		balance += amount;
//	}
//
//	int withdraw(int amount ) {
//		balance -= amount;
//		return balance;
//	}
//	//getter 메소드 
//	public String getNum() {  //호출하면 num; 리턴 
//		return num;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getBalance() {
//		return balance;

