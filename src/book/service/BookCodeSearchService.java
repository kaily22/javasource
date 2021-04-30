package book.service;

import java.sql.Connection;

import book.dao.BookDAO;
import book.domain.BookVO;
import static book.dao.JDBCUtil.*;


public class BookCodeSearchService {

	public BookVO getBookCode(int bookcode) {

		Connection con = getConnection();
		BookDAO dao = new BookDAO(con);

		BookVO vo = dao.selectOne(bookcode);
		close(con);

		return vo;

	   }

	private void close(Connection con) {
		// TODO Auto-generated method stub
		
	}
	}
