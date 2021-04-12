package ch5;

public class SingletonEx {

	public static void main(String[] args) {
	   //The constructor Singleton() is not visible
	   // Singleton single = new Singleton(); //default 생성자를 부름 /아무것도 안넣고 부르면=>default
	   
	   
	   Account account1 = new Account();
	   Account account2 = new Account();
	   Account account3 = new Account();
	   System.out.println(account1 == account2? "account1==account2" :"account1!=account2");
	   System.out.println(account1 == account3? "account1==account3" :"account1!=account3");
	   
	   
	   //Singleton.singleton = null;
	   Singleton single1 = Singleton.getInstance();
	   Singleton single2 = Singleton.getInstance();
	   Singleton single3 = Singleton.getInstance();
	   Singleton single4 = Singleton.getInstance();
	   
	   System.out.println(single1==single2); //같은 객체가 되어버림(동일한 객체만 넘겨받음)
	   System.out.println(single3==single2);
	   System.out.println(single1==single3);
	   System.out.println(single2==single4);
	}

}
