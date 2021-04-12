package ch3;

// 1~100까지의 정수 중에서 3의 배수와 5의 배수 총합 구하기
public class ForExe9 {

	public static void main(String[] args) {
		int sum= 0;
		for (int i = 1; i <= 100; i++) {
		 if(i%3==0 && i%5==0) {
		   sum+=i;
		 }
		}
		System.out.println("총합은 얼마가 나오나요? " +sum );
	}
}
