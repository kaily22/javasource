package ch6;

import java.util.Scanner;

public class BankApplication2 {
	// 속성(인스턴스 필드, 프로퍼티~)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------");
			System.out.println("선택 > ");

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

	private static void withdraw() {
		// 사용자한테 계좌번호 입력받기
		System.out.println("출금할 계좌번호 입력: ");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);

		if (acc != null) {
			// 출금액 입력받기
			System.out.println("출금액 입력 : ");
			int balance = Integer.parseInt(sc.nextLine());
			// 잔액 = 잔액 - 출금액
			if (acc.getBalance() < balance) {
				System.out.println("출금 가능액이 부족합니다.");
			} else {
				acc.setBalance(acc.getBalance() - balance);
			}
		} else {
			System.out.println("계좌번호를 확인해주세요");
		}

	}

	// 예금하기
	private static void deposit() {
		// 사용자한테 계좌번호 입력받기
		System.out.println("입금할 계좌번호 입력");
		String ano = sc.nextLine();
		Account acc = findAccount(ano);
		if (acc != null) {
			// 예금액 입력받기
			System.out.println("예금액 입력 :");
			int balance = Integer.parseInt(sc.nextLine());

			// 잔액=잔액+예금액

			acc.setBalance(acc.getBalance() + balance);
//         int balance+=Integer.parseInt(deposit);
		} else {
			System.out.println("계좌번호를 확인해 주세요");
		}

	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		// ano와 일치하는 Account가 배열의 몇번째에 존재하는지 확인하고
		Account findAcc = null;
		for (Account acc : accountArray) {
			if (acc != null) {
				if (acc.getAno().equals(ano)) {// 문자열 비교시에는 ==보단 equals
					findAcc = acc;
				}
			}
		}
		return findAcc;
//      for(int i=0;i<accountArray.length;i++) {
//         if(accountArray[i]==account.getAno())
//         return;
//      }
		// 리턴

	}

	static void accountList() {
		// accountArray계좌목록 보기
		System.out.println("------------------------");
		System.out.println("계좌번호    계좌주     잔액");
		System.out.println("------------------------");

		for (Account account : accountArray) {
			if (account != null) {
				System.out.printf("%s \t %s\t %d\n", account.getAno(), account.getOwner(), account.getBalance());

			}
		}
//      for(int i=0;i<accountArray.length;i++) {
//         if(accountArray[i]!=null) {
//         System.out.printf("[%d] 계좌정보 \n",i);
//         System.out.println("계좌번호 :"+accountArray[i].getAno());
//         System.out.println("계좌주 :"+accountArray[i].getOwner());
//         System.out.println("잔액 :"+accountArray[i].getBalance());
//         break;
//      
//      }
//      }

	}

	static void createAccount() {
		// 계좌번호, 계좌주, 잔액입력받기
		// 한 사람에 대한 것만 받을거기 때문에 반복 x
		System.out.println("계좌번호 입력");
		String ano = sc.nextLine();
		System.out.println("계좌주 입력");
		String owner = sc.nextLine();
		System.out.println("잔액 입력");
		int balance = Integer.parseInt(sc.nextLine());

		// Account 객체 생성
//      Account[] accountArray=new Account[100];
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}

		// accountArray에 생성된 객체를 담기

	}
}
