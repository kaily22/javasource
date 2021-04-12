package ch6;

import ch5.Car;
import ch5.Student;

public class CarEx {

	public static void main(String[] args) {
     Car car  = new Car();
     Student student = new Student();
     
     //초기화 => 인자를 받는 생성자 
     Account account = new Account("122-12","홍길동",10000);
     //계좌번호 확인 
     System.out.println("계좌 번호 확인 : " +account.getAno());
     System.out.println("잔액 확인 : " +account.getBalance());
     // account.name = "홍길동";	 //접근 x
     
     
     
     
    }
}
