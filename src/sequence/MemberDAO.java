package sequence;

import java.security.AlgorithmParametersSpi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	// jdbc - 드라이버 로드/연결시도/sql 문 전송/sql문 실행/ 결과 받기

	public Connection getConnection() {
		try {

			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "shop";
			String password = "12345";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 잘 안되면 null
	}

	public boolean insert(String userName) {
		boolean insertFlag = false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			String sql = "insert into member(userNO, userName) values(member_seq.nextval,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				insertFlag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return insertFlag;

	} // insert end

	public List<MemberVO> getList() {
		String sql = "select * from member";
		List<MemberVO> list = new ArrayList<MemberVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setUserNo(rs.getInt("userNo"));
				vo.setUserName(rs.getString("userName"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			rs.close();
			con.close();
			pstmt.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	} // getList end

	public MemberVO getRow(int userNo) {
		String sql = "select * from member where userNo=?";
		MemberVO vo = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			   vo = new MemberVO();
			   vo.setUserNo(rs.getInt("userNo"));
			   vo.setUserName(rs.getString("userName"));
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			rs.close();
			pstmt.close();
			con.close();

			} catch (Exception e2) {
			e2.printStackTrace();
			}
		}
		return vo;
	}

}
