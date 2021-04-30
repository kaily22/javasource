package book.ui;

import java.util.List;
import java.util.Scanner;

import book.domain.BookVO;

public class ConsoleUtil {

	public int getBookCode(Scanner sc) {
		System.out.print("도서코드를 입력하세요 : ");
		int bookcode = Integer.parseInt(sc.nextLine());
		return bookcode;
	}

	public void printGetMessage(BookVO vo) {
		System.out.println("\n도서번호\t도서 이름\t작가\t비용");
		System.out.print(vo.getBookcode() + "\t");
		System.out.print(vo.getBookname() + "\t");
		System.out.print(vo.getWriter() + "\t");
		System.out.print(vo.getCost() + "\n");

	}

	public void printGetFailMessage(int bookcode) {
		System.out.println("찾으시는 도서가 없습니다.");
	}

	public String getBookName(Scanner sc) {
		System.out.print("도서 이름를 입력하세요 : ");
		String bookname = sc.nextLine();
		return bookname;
	}

	public void printGetBookNameMessage(List<BookVO> list) {
		System.out.println("\n도서번호\t도서 이름\t작가\t비용");

		for (BookVO vo : list) {
			System.out.print(vo.getBookcode() + "\t");
			System.out.print(vo.getBookname() + "\t");
			System.out.print(vo.getWriter() + "\t");
			System.out.print(vo.getCost() + "\n");
		}
	}

	public void printBookNameFailMessage() {
		System.out.println("찾으시는 도서가 없습니다.");
	}

	public BookVO printAddMessage(Scanner sc) {

		System.out.println("*************도서 정보 입력*********");
		System.out.print("도서코드(숫자 4자리로 입력) >> ");
		int bookcode = Integer.parseInt(sc.nextLine());
		System.out.print("도서명 >> ");
		String bookname = sc.nextLine();
		System.out.print("도서저자 >> ");
		String writer = sc.nextLine();
		System.out.print("도서가격 >> ");
		int cost = Integer.parseInt(sc.nextLine());

		BookVO vo1 = new BookVO();
		vo1.setBookcode(bookcode);
		vo1.setBookname(bookname);
		vo1.setWriter(writer);
		vo1.setCost(cost);
		return vo1;
	}

	public void printAddSuccessMessage() {
		System.out.println("도서 정보 입력 성공");

	}

	public void printAddFailMessage() {
		System.out.println("도서 정보 입력 실패");

	}

}
