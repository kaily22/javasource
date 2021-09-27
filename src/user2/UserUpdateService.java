package user2;

import java.sql.Connection;
import static user.JdbcUtil.*;

public class UserUpdateService {
	public boolean UserUpdate(String mobile, String addr, int no) {

		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);

		boolean isUpdate = false;
		int result = dao.update(mobile, addr, no);

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
