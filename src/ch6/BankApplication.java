package ch6;

import java.util.Scanner;

public class BankApplication {
//속성(인스턴스 필드, 프로퍼티...)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in); // private ->공통으로 쓸것이다.

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌 생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택하시오 > ");

			int selectNo = Integer.parseInt(sc.nextLine());

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			}
		}
	}
//출금하기

private static void withdraw() {
       System.out.print("계좌번호 입력>> ");
       String ano = sc.nextLine();
       Account acc = findAccount(ano);
       
       if(acc!=null) {
         System.out.println("출금액 입력>> ");
         int balance = Integer.parseInt(sc.nextLine());
         
         if (acc.getBalance() < balance) {
         System.out.println("출금 가능액이 부족합니다.");
         } else {
           acc.setBalance(acc.getBalance() - balance);
         }
       } else { 
       System.out.println("계좌번호를 확인해주세요 ");
       }
}




//예금하기
	private static void deposit() {
//사용자에게 계좌번호 입력받기
		System.out.print("계좌번호 입력>> ");
		String ano = sc.nextLine();
		Account acc = findAccount(ano); // find 함수를 호출

		if (acc != null) {
			// 예금액 입력받기
			System.out.print("예금액 입력>> ");
			int balance = Integer.parseInt(sc.nextLine());
			// 잔액 = 잔액+예금액
			acc.setBalance(acc.getBalance() + balance);
			// int balance += Integer.parseInt(deposit);
		} else {
			System.out.println("계좌번호 확인해주세요");
//잔액 = 잔액 + 예금액 
		}
	}

//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) { // ano를 받아서 옴
		// ano(계좌 번호) ->sclnextLine 와 일치하는 Account -> accountlist
		// 가 몇번째 있는지 알아보고
		// 배열에 존재하는지 확인하고
		// 리턴
		Account findAcc = null;
		for (Account acc : accountArray) {
			if (acc != null) { // null이 아닌것만 비교
				if (acc.getAno().equals(ano)) {// == 문자열은 equals
					findAcc = acc;
				}
			}
		}
		return findAcc;
	}

//accountArray 게좌목록 보기
	private static void accountList() {
		System.out.println("---------------------------");
		System.out.println("계좌번호      계좌주      잔액");
		System.out.println("---------------------------");
		for (Account arr : accountArray) {
			if (arr != null) {
				System.out.printf("%s\t%s\t%d\n", arr.getAno(), arr.getOwner(), arr.getBalance());
			}
		}
	}

	private static void createAccount() { // 한 사람에 대해서만 받을 거다 => 반복문 x
		// 계좌번호, 계좌주, 잔액
		System.out.print("계좌번호 입력 : ");
		String ano = sc.nextLine();
		System.out.print("소유주 입력 : ");
		String owner = sc.nextLine();
		System.out.print("잔액 입력 : ");
		int balance = Integer.parseInt(sc.nextLine());

		// account 객체 생성
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance); // 기본 생성자로 만들 수 x
				System.out.println("계좌가 생성되었습니다. ");
				break;
			}
		}
		// accountArray에 생성된 객체를 담는다.
	}
}
