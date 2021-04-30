package book.ui;

import java.util.Scanner;

import book.action.Action;
import book.action.BookAddAction;
import book.action.BookCodeSearchAction;
import book.action.BookTitleSearchAction;

public class BookUi {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("*************도서관리 프로그램**************");
			System.out.println("1.도서 정보 조회(도서코드)");
			System.out.println("2.도서 정보 조회(도서명)");
			System.out.println("3.도서 정보 입력");
			System.out.println("4.프로그램 종료");
			System.out.println("***************************************");

			System.out.println("메뉴 번호");
			int menu = Integer.parseInt(sc.nextLine());

			Action action = null;

			switch (menu) {
			case 1:
				action = new BookCodeSearchAction();
				break;
			case 2:
				action = new BookTitleSearchAction();
				break;

			case 3:
				action = new BookAddAction();
				break;

			case 4:
				run = false;
				break;
			}

			if (action != null) {
				action.execute(sc);
			}
		}
	}

}
