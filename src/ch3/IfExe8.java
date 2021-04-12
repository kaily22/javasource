package ch3;

import java.util.Scanner;
//사용자한테 값을 입력받아 홀수,짝수인지 출력하기(if, else)
public class IfExe8 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요 : ");
	    int num = sc.nextInt();
	    
	    if (num % 2==0) {
	       System.out.println("짝수입니다");
	    }
	    else {
	       System.out.println("홀수입니다");
	    }
	    
	    	    
	    
	    
	}

}
