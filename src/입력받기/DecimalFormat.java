package 입력받기;

import java.util.Scanner;

public class DecimalFormat {

	public static void main(String[] args) {
	
	
	String amount;
	
	System.out.print("금액을 입력하세요 >>> ");
	Scanner sc = new Scanner(System.in);
	
	long totalamount = sc.nextLong();
	
	amount = Utils.toNumberFormat(totalamount);
	
	System.out.println("금액 : " +amount);

	}

}
