package ch3;

import java.util.Scanner;

public class BankExe2 {

	public static void main(String[] args) {
		boolean run = true;

		// 잔액을 나타내는 변수
		int balance = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.print("선택 >>");

			int n = sc.nextInt();

		
			 if(n==1){
			 System.out.println("예금 >>");
			 balance += sc.nextInt();
			 
			  } else if(n==2) {
			  System.out.print("출금할 금액을 선택하세요 : "); int money =
			  balance -= sc.nextInt(); 
			  } else if(n==3) { 
			  System.out.println("현재 : "+balance);
			  } else if(n==4) { 
			  run = false; // 1번일때 예금액 입력받기 // 잔액 = 잔액 + 예금
			  
			  // 2번: 출금액 입력받기 // 잔액 = 잔액 - 출금
			  
			  // 3번: 현재까지의 잔액 출력 // 4번 : 프로그램 종료 }
		}

			System.out.println("종료");
		}

	}

}
