package ch12;

public class SystemEx2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //시작시간
		
		long sum = 0;
		for (int i = 1; i < 10000000; i++) {
			sum += i;
		}

		long end = System.currentTimeMillis(); //끝나는 시간
		System.out.println("1~10,000,000까지의 합 : " +sum);
		System.out.println("1~10,000,000 더하는데 걸린 시간 : " + (end - start));
	}
}
