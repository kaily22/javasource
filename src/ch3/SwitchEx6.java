package ch3;

import java.util.Scanner;

//간단 계산기 만들기
//사용자에게 두 개의 숫자와 연산자를 입력받기, 입력받은 값에 의해서 계산 한 후 출력하기
public class SwitchEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("연산자를 입려하세요 : " );
		String oper = sc.nextLine(); // + => "+"
				
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		switch (oper) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "%":
		System.out.println(num1%num2);
			break;
		}
		

	}

}
//result 잡으면
// 마지막에 한번만 넣기 sysout printf("%d %s &d = %d", num1, oper, num2, result)