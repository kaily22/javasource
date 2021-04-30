package book.service;

import static book.dao.JDBCUtil.getConnection;

import java.sql.Connection;
import java.util.List;

import book.dao.BookDAO;
import book.domain.BookVO;

public class BookTitleSearchService {

		public List<BookVO> getBookName(String bookname) {

			Connection con = getConnection();
			BookDAO dao = new BookDAO(con);

			List<BookVO> list = dao.select(bookname);
			close(con);

			return list;

		   }

		private void close(Connection con) {
			// TODO Auto-generated method stub
			
		}
		}

