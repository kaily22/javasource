package ch3;

public class ForExe2 {

	public static void main(String[] args) {
//1~10 합
        int sum =0;
        for(int i = 1; i<11;i++) {
           sum = sum+i;
	}
	
	System.out.println("1~10까지의 합 : " +sum);
	
	sum =0;
	
	for(int i = 1; i<101;i++) {
	  sum += i;
	}
	System.out.println("1~100까지의 합 : " +sum);

	}
}
