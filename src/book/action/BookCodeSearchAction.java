package book.action;

import java.util.Scanner;

import book.domain.BookVO;
import book.service.BookCodeSearchService;
import book.ui.ConsoleUtil;

public class BookCodeSearchAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();

		int bookcode = util.getBookCode(sc);

		BookCodeSearchService codeservice = new BookCodeSearchService();
		BookVO vo = codeservice.getBookCode(bookcode);

		if (vo != null) {
			util.printGetMessage(vo);
		} else {

			util.printGetFailMessage(bookcode);
		}
	}

}
