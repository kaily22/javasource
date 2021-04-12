package ch12;

public class MathEx3 {

	public static void main(String[] args) {
		// 1~3까지 난수를 3개 생성한 뒤 한 줄에 출력하기
		// 모두 같은 수가 나올 때까지 반복하고, 모두 같은 수이면 성공 출력 후 프로그램 종료

		// 2 1 2
		// 2 3 2
		// 1 3 3
		// 1 1 1
		// 성공
		
		while (true) {
			int num = (int) (Math.random() * 3)+1;
			int num1 = (int) (Math.random() * 3)+1;
			int num2 = (int) (Math.random() * 3)+1;

			System.out.println(num + "\t" + num1 + "\t" + num2);
			if (num == num2 && num1 == num2) {
				System.out.println("성공");
				break;
			}
		}

	}

}
