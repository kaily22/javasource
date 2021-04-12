package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken5 {


	public static void main(String[] args) {
		
		//키보드로 문자열을 읽어 "/"문자로 분리하는 프로그램 작성
		//예시) 아빠/엄마/수연/연수/수희 => 아빠
		//엄마
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, "/");
		
		while(token.hasMoreTokens()) {
		System.out.println(token.nextToken());
	
		}		

	}

}
