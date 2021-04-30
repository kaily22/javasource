package book.service;

import java.sql.Connection;
import static book.dao.JDBCUtil.*;

import book.dao.BookDAO;
import book.domain.BookVO;

public class BookAddservice {
	public boolean bookAdd(int bookcode, String bookname, String writer, int cost) {
		boolean isAdd = false;

		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);

		int result = dao.insert(bookcode, bookname, writer, cost);
		if (result > 0) {

			commit(con);
			isAdd = true;
		} else {
			rollback(con);
		}
		
		close(con);

		return isAdd;

	}

	private void close(Connection con) {
		// TODO Auto-generated method stub
		
	}
}