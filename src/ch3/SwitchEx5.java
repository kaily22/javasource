package ch3;
// 가위 바위 보 게임

// 사용자가 내는 가위(1), 바위(2), 보(3)입력받기
//컴퓨터가 내는 부분 -> Math.random추출
//누가 이겼는지 출력받기

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요요 : ");
		int num = sc.nextInt();
		int com = (int) (Math.random() * 3)+1;
		System.out.println(com);
		
		switch (num-com) {
		case 2:case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
		System.out.println("당신이 이겼습니다.");
		default:
			System.out.println("비겼습니다.");
			break;
		}

	}

}
