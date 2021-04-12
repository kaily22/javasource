package ch6;

public class Account { //클래스에는 proteced붙이지 x
//은행 계좌 클래스
//속성 -계좌번호, 이름, 잔액

	private String ano; //직접 접근 막음.
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}