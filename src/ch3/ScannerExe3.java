package ch3;

import java.util.Scanner;

public class ScannerExe3 {

	public static void main(String[] args) {
	
	//System.out : 화면(표준 출력 장치)
	//System.int : 키보드
	
	Scanner sc = new Scanner(System.in);
	System.out.print("문자를 입력하세요: ");
	//nextInt() : 값을 읽어올 때 공백을 기준으로 읽어옴 , 공백 전 숫자만 읽어온다
	//nextLine(): 값을 읽어올 때 \n기준으로 읽어옴
	//next() : = nextInt()
	
	String str = sc.next();
	System.out.println(str);
	

	}

}
