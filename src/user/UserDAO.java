package user;

import static user.JdbcUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private Connection con;

	public UserDAO(Connection con) {
		super();
		this.con = con;

	}

//select => 조건에 맞는 레코드를 가져오기
//select * from userTBL where no = 1 => 여러개 OR 1개;

	public UserVO selectOne(int no) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO vo = null;
		String sql = "select * from userTBL where no = ?";

		try {

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
			close(rs);

		}
		return vo;

	}

	// select * from userTBL where username LIKE ~~ =>여러개

//select => 전체의 레코드를 가져오기(여러개 => lis
//select * from userTBL;

	public List<UserVO> getList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from userTBL";
		List<UserVO> list = new ArrayList<UserVO>();
		try {

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
				list.add(vo);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			close(rs);
			close(pstmt);

		}
		return list;

	}
	// update = 전화번호, 주소
	// update useTBL set mobile = ? , addr =? where no =? no는 주로 pk로 들어옴

	public int update(String mobile, String addr, int no) {
		PreparedStatement pstmt = null;
		UserVO vo = new UserVO();
		String sql = "update userTBL set mobile =?, addr =?, where no =?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			pstmt.setString(2, addr);
			pstmt.setInt(3, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}

	// delete
	public int delete(int no) {
		PreparedStatement pstmt = null;
		UserVO vo = new UserVO();
		String sql = "delete userTBL where no =?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	// insert
	public int insert(String userName, int birthYear, String addr, String mobile) {
		//public int insert(UserVO vo) {
		PreparedStatement pstmt = null;
		String sql = "insert into usertbl(no,userName, birthYear,addr, mobile) Values(user_seq.nextval, ?,?,?,? )";

		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName); //(1,vo.getUserName())
			pstmt.setInt(2, birthYear); //(2,vo.getBirthYear())
			pstmt.setString(3, addr); //(3, vo.getAddr())
			pstmt.setString(4, mobile); //(4, vo.getMobile())
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

}