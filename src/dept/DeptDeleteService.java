package dept;

import java.sql.Connection;
import static emp.JdbcUtil.*;

public class DeptDeleteService {

	public boolean deptDelete(int deptno) {
		boolean isDelete = false;

		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);

		if (dao.delete(deptno)) {

			commit(con);
			isDelete = true;
		} else {
			rollback(con);
		}

		close(con);
		return isDelete;

	}
}
