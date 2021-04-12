package ch12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken6 {

	public static void main(String[] args) {
//사용자로부터 문자열을 입력 받아 공백으로 분리된 어절이 몇 개인지 출력하기
//exit가 들어오면 프로그램 종료

//예시) 오늘은 금요일 입니다. =>3

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringTokenizer token = new StringTokenizer(str);
		System.out.println(token.countTokens());

		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
			
		    }			
		}

	}


/*while(true){
sysout("문자를 입력하세요")

* String input = null;
* while(true){
*sysout("문자를 입력하세요");
*input = sc.nextLine();
*if(!input.equals("exit")) {
*StringToeknizer token = new StringTokenizer(input);
*sysout("분리된 어절수 : " +token.countTokens());
*else { sysout("프로그램을 종료합니다.")*
*break;
*}
*
*/