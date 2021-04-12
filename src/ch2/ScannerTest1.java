package ch2;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
	     // 사용자에게 점수를 입력받아 그 숫자가 짞수인지 홀수인지 판별
	     
	     Scanner sc = new Scanner(System.in);
	     System.out.print("숫자 입력 :  ");
	     
	     int num = sc.nextInt();
	     System.out.println(num % 2 == 0? "짝수": "홀수");
	     

	}

}
