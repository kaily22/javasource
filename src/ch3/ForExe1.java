package ch3;

public class ForExe1 {

	public static void main(String[] args) {
		// 1~10까지 출력을 하고 싶다.
		// 비워두고 콤마 찍으면 -> 무한루프에 빠진다.
		for (int i = 1; i <= 10; i++) {

			System.out.print(i + "\t");
		}

		System.out.println();

		// 10~1까지 출력
		for (int j = 10; j >= 1; j--) {
			System.out.print(j + "  ");
		}
	}

}
