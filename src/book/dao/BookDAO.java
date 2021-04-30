package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static book.dao.JDBCUtil.*;
import static emp.JdbcUtil.close;

import book.domain.BookVO;
import emp2.EmpVO;

public class BookDAO {

	private Connection con;

	public BookDAO(Connection con) {
		this.con = con;

	}

	public BookVO selectOne(int bookcode) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from BookTBL where bookcode=?";
		BookVO vo = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookcode);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new BookVO();
				vo.setBookcode(rs.getInt("bookcode"));
				vo.setBookname(rs.getString("bookname"));
				vo.setWriter(rs.getString("writer"));
				vo.setCost(rs.getInt("cost"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}

	public List<BookVO> select(String bookname) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from BookTBL where bookname like ?";
		
		List<BookVO> list = new ArrayList<BookVO>();
		BookVO vo = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+bookname+"%");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new BookVO();
				vo.setBookcode(rs.getInt("bookcode"));
				vo.setBookname(rs.getString("bookname"));
				vo.setWriter(rs.getString("writer"));
				vo.setCost(rs.getInt("cost"));
				list.add(vo);
			}
			
			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}

	public int insert(int bookcode, String bookname, String writer, int cost) {

		PreparedStatement pstmt = null;

		int result = 0;
		try {

			String sql = "insert into BookTBL(bookcode,bookname, writer,cost) values(?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookcode);
			pstmt.setString(2, bookname);
			pstmt.setString(3, writer);
			pstmt.setInt(4, cost);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}// insert end
}
