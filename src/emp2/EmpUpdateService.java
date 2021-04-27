package emp2;

import static emp.JdbcUtil.*;

import java.sql.Connection;

public class EmpUpdateService {
	public boolean empUpdate(int comm, int empno) {

		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);

		boolean isUpdate = false;

		int result = dao.update(comm, empno);

		if (result > 0) {
			commit(con);
			isUpdate = true;
		} else {
			rollback(con);

		}
		close(con);
		
		return isUpdate;

	}

}
