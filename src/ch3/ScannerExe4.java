package ch3;

import java.util.Scanner;

public class ScannerExe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력: ");
		
		//35 -> "35"라고 인식 => 그냥 숫자로 나오기
		int num = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("연산자 입력 : "); 
		String str =sc.nextLine(); // line-> \n이 엔터로 읽어들여옴
		
		System.out.print("두번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.printf("%d %s %d", num, str, num2);


	}

}
