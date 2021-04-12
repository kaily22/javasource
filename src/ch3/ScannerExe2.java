package ch3;

import java.util.Scanner;

public class ScannerExe2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 수 입력: ");
	int num = sc.nextInt(); //35 엔터 읽어옴
	
	System.out.print("연산자 입력 : "); 
	String str = sc.next(); // line-> \n이 엔터로 읽어들여옴
	
	System.out.print("두번째 수 입력 : ");
	int num2 = sc.nextInt();
	
	System.out.printf("%d %s %d", num, str, num2);

	}

}

//모두를 nextLine()으로 처리