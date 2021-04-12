package ch4;

import java.util.Scanner;

public class ArryaExe17 {

	public static void main(String[] args) {

		boolean run = true;
		int[] scores = null;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수 리스트| 4.분석 |5. 종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 사용자 입력값 맞춰 배열 생성s
				System.out.println("학생 수 입력>>>>>");
				int studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수 입력>>>>");
					scores[i] = sc.nextInt();
				}

			} else if (selectNo == 3) {

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("[%d] 점수 : %d\n", (i + 1), scores[i]);
				}
			} else if (selectNo == 4) {

				int max = 0;
				int total = 0;
				for (int i = 0; i < scores.length; i++) {
					total += scores[i];
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최대값 : " + max);
				System.out.println("평균: " + total / scores.length);
			} else if (selectNo == 5) {

				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
