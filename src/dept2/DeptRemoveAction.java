package dept2;

import java.util.Scanner;

import dept.DeptDeleteService;

public class DeptRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 삭제할 부서 정보 입력받기 =>util

		ConsoleUtil util = new ConsoleUtil();
		int deptno = util.printDelete(sc);

		// 부서 삭제 서비스 요청

		DeptDeleteService deleteservice = new DeptDeleteService();
		boolean isDelete = deleteservice.deptDelete(deptno);
		// 결과에 따라 메세지 출력

		if (isDelete) {
			util.printDeleteSuccessMessage();
		} else {
			util.printDeleteFailMessage();
		}

	}

}
