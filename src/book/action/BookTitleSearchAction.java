package book.action;

import java.util.List;
import java.util.Scanner;

import book.domain.BookVO;
import book.service.BookCodeSearchService;
import book.service.BookTitleSearchService;
import book.ui.ConsoleUtil;

public class BookTitleSearchAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		String bookname =util.getBookName(sc);

		BookTitleSearchService nameservice = new BookTitleSearchService();
		List<BookVO> list = nameservice.getBookName(bookname);
		

		if (!list.isEmpty()) {
			util.printGetBookNameMessage(list);
		} else {

			util.printBookNameFailMessage();
		}
	}

}
