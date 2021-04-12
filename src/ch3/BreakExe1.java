package ch3;

//break; 반복문을 중지 할 때 사용, if문과 사용됨
public class BreakExe1 {

	public static void main(String[] args) {

		int sum = 0, i = 0;

		while (true) { //중지시키는 코드 필요
			if (sum > 100) {
				break;
			}
			++i;
			sum += i;

		}
		System.out.println("i = " + i);
		System.out.println("sum  = " + sum);
	}
}