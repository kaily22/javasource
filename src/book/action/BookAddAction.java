package book.action;

import java.util.Scanner;

import book.domain.BookVO;
import book.service.BookAddservice;
import book.ui.ConsoleUtil;

public class BookAddAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		BookVO vo = util.printAddMessage(sc);

		BookAddservice addservice = new BookAddservice();
		boolean isAdd = addservice.bookAdd(vo.getBookcode(), vo.getBookname(), vo.getWriter(), vo.getCost());

		if (isAdd) {
			util.printAddSuccessMessage();
		} else {
			util.printAddFailMessage();

		}
	}
}
