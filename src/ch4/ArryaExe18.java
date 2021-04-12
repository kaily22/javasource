package ch4;

import java.util.Scanner;

public class ArryaExe18 {

	public static void main(String[] args) {
		// 학생들의 점수를 받아서 최고 점수 및 평균 점수를 구하는기

		Scanner sc = new Scanner(System.in);
		int scores[] = null;

		System.out.print("학생 수를 입력하세요 : ");
		
		int stuNum = sc.nextInt();
		
		scores = new int[stuNum];
		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생들의 점수를 입력하세요 : ");
			scores[i] = sc.nextInt();
		}
		
		for(int score:scores) {
			System.out.println(score);
		}		
		// 몇 명의 학생? => 입력
//		}//기본값은 0으로 들어간다. int -> float, double => 기본 값은 0.00 
	
	}

}
