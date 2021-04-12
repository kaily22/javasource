package ch3;

import java.util.Scanner;

public class IfExe10 {

	public static void main(String[] args) {
	//사용자에게 년도를 입력받아 그 년도가 윤년인지 평년인지를 출력하기
	
	Scanner sc = new Scanner (System.in);
	System.out.print("년도를 입력해 주세요 : " );
	int year = sc.nextInt();
	
	if((year % 4 ==0) && (year % 100!=0 ) || (year%400 == 0)) {
	   System.out.println("윤년");
	}
	else {
	   System.out.println("평년");
	}
	
	
	
	

	}

}
