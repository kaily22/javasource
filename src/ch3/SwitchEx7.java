package ch3;
//사용자에게 점수 입력받기(백점이 최대)
//해당 점수에 따라 A~F등급 출력하기
//90점 이상 : A, 80점 이상 : B, 70점 이상 : C, 나머지는 F
// 점수/10

import java.util.Scanner;

public class SwitchEx7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int grade;
	System.out.print("점수를 입력하세요 : ");
	grade = sc.nextInt();
	grade = grade/10;
	
	switch (grade) {
	
	case 10:
	case 9:
	System.out.println("A");
		
		break;
	case 8:
		System.out.println("B");
			
			break;
	case 7:
		System.out.println("C");
			
			break;
	default:
	System.out.println("F");
		break;
	}
	
	}

}
