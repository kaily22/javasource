package emp2;

import java.sql.Connection;
import java.util.List;
import static emp.JdbcUtil.*;

public class EmpSelectService {
	public List<EmpVO> getEmpList() {
		
		//Connection con = JdbcUtil.getConnection();
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		//트랜잭션 처리를 위해서 Connection 객첼ㄹ 서비스 클래스에서 생성
		//트랜잭션은 커넥션 단위로 처리
		List<EmpVO> list = dao.select();
		
		close(con);
		return list;

	}
}
