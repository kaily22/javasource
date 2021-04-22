package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest {

	// DB와 연결을 위한 객체
	static Connection con = null;
	// SQL 구문 전송을 위한 객체
	static PreparedStatement pstmt = null;
	// SQL 처리 결과를 담은 객체
	static ResultSet rs = null;

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		// DBTest test = new DBTest();
//		String sql = null;
//		con = getConnection();

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1.EMP | 2.DEPT | 3.SALGRADE | 4. 종료");
			System.out.println("---------------------------------------");

			System.out.println("메뉴 선택");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				EmpDAO empdao = new EmpDAO();
				empdao.select();
				break;
			case 2:
				DeptDAO dao = new DeptDAO();
				dao.deptSelect();
				break;
			case 3:
				GradeDAO gradeDao = new GradeDAO();
				gradeDao.select();
				break;
			case 4:
				flag = false;
				break;

			default:
				break;
			}

		}
	}

// print 담당
	public static void print(ResultSet rs) {
		try {
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getInt(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.print(rs.getInt(8));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 커넥션 시도 - 데이터베이스 연결 문자열 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			return DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}