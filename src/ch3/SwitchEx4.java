package ch3;

public class SwitchEx4 {

	public static void main(String[] args) {
		// 8~11시 정수 추출
		int time = (int) (Math.random() * 4) + 8; // 0~3나오고 +8 그래서 8~11나옴
		System.out.println("[현재시간 : " +time+"]");
//break 만나기전까지 계속 내려감
		switch (time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의 진행");
		case 10:
			System.out.println("업무 진행");
		default:
			System.out.println("외근");
			break;
		}

	}

}
