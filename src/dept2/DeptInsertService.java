package dept2;

import java.sql.Connection;
import static emp.JdbcUtil.*;

public class DeptInsertService {

	public boolean deptInsert(DeptVO vo) {

		boolean isInsert = false;

		Connection con = getConnection();
		DeptDAO dao = new DeptDAO(con);

		if (dao.insert(vo)) {
			commit(con);
			isInsert = true;
		} else {

			rollback(con);

		}

		close(con);
		return isInsert;

	}

}
