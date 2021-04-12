package ch3;

import java.util.Scanner;

public class IfExe11 {

	public static void main(String[] args) {
	//사용자로부터 3개의 정수를 입력받아 가장 작은 값을 출력하시오
	
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 수 입력 :  ");
	int num1 = sc.nextInt();
	System.out.println("두번째 수 입력 :  ");
	int num2 = sc.nextInt();
	System.out.println("세번째 수 입력 :  ");
	int num3 = sc.nextInt();
	
	int min = num1;
	
	if(min > num2) {
	   min =num2;
	}
	
	if(min > num3) {
	   min= num3;
	}
	
	System.out.println("세 숫자 중에서 가장 작은 숫자 : " +min);
		

		}

}