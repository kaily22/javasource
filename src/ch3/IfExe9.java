package ch3;

import java.util.Scanner;

public class IfExe9 {
//시간당 급여 계산 출력하기
//시간당 급여 : 5000
// 근무 시간 입력받기, 근무 시간 8시간 초과시 원래 임금의 1.5배를 받는다.
// 근무시간이 8시간 전까지는 원래대로 5000

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("근무 시간을 입력하세요:  ");
	   int hours = sc.nextInt();
	   int sal = 5000;
	   int pay = 0;
	   if (hours > 8) {
	      hours = hours-8;
	      pay = (int)(sal*hours*1.5) + sal*8 ;
	   }
	   else {
	          pay = sal * hours;
	              
	   }
	   System.out.println("받는 임금 : " +pay);
	   

	}

}
