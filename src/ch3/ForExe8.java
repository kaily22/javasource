package ch3;
// 1~100까지 정수 중에서 3의 배수만을 더하기(단, 9의 배수는 x)

public class ForExe8 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 9 != 0) {
			
			sum += i;
			}
		}
       System.out.println("총합은 ? :" +sum);
	}
}
