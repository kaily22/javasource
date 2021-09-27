package 입력받기;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class JuminNumber {
	public static void main(String[] args) {

		String juminNum;
		int sum = 0;
		int[] weight = { 2, 3, 4, 5, 6, 7, 0, 8,9,2, 3, 4, 5 };
		int temp, result;

		System.out.print("주민번호를 입력하세요 >>> ");
		Scanner sc = new Scanner(System.in);

		juminNum = sc.next();

		String regex = "^[0-9]{6}-[1234][0-9]{6}$";

		boolean check = juminNum.matches(regex);

		if (check == false) {
			System.out.println("주민번호 형식에 맞지 않습니다.");
			return;
		}
		System.out.println("주민번호 형식에 맞습니다.");

		// 유효성 검사 1단계

		for (int i=0; i<13; i++) {

			if (juminNum.charAt(i) == '-')
				continue;

			// 문자에서 숫자로 계산
			sum += (juminNum.charAt(i)-48) * weight[i];
		}

		temp = 11 - (sum % 11);

		result = temp % 10;

		if (result == juminNum.charAt(13)-48) {
			System.out.println("입력 번호가 정상입니다.");

			Calendar cal = Calendar.getInstance(Locale.KOREA);

			int year = cal.get(Calendar.YEAR);

			int yy = Integer.parseInt(juminNum.substring(0, 2));

			if (juminNum.charAt(7) - 48 < 3) {

				yy = yy + 1900;

			} else {
				yy = yy + 2000;
			}

			int age = year - yy + 1;

			System.out.println(age);

			if ((juminNum.charAt(7) - 48) % 2 == 0) {
				System.out.println("성별은 여자입니다.");

			} else {
				System.out.println("성별은 남자입니다.");

			}

		} else {
			System.out.println("입력한 주민번호 x");
		}

	}
}
