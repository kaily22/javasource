package ch5;

import java.util.Scanner;

public class SubscriberInfoEx {

	public static void main(String[] args) {
	
	SubscriberInfo person1 = new SubscriberInfo();
	SubscriberInfo person2 = new SubscriberInfo("홍길동","hong123","hon123@@#@");
	SubscriberInfo person3 = new SubscriberInfo("강감찬","kang123","kang123@@#@","01051346324","송파구");
	
//person2의 비밀번호 변경
//변경 비밀번호를 넘겨줌
//new Scanner도 가능/ 

    System.out.println("이름 : " +person2.name);
    System.out.println("아이디 : " +person2.name);
    System.out.println("패스워드 : " +person2.name);
    System.out.println("주소 : " +person2.name);
     
   
    Scanner sc = new Scanner(System.in);
    System.out.println("변경할 비밀 번호 입력: ");
    String changep = sc.nextLine();	
	person2.ChangePwd(changep);
	System.out.println("변경된 비밀 번호" +changep);
	person2.SetTel("01012345678");
	person3.SetAddr("강남구");
	System.out.println("전화번호 " +person2.mobile);
	System.out.println("주소 : " +person2.addr);
	
	
	//person3.ChangePwd("hong456");
	
	//person3.SetTel("01012345667");
	
	//확인
	//System.out.println("변경된 전화번호 : " +person3.mobile);

	}
}
