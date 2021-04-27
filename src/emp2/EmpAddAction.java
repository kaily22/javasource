package emp2;

import java.util.Scanner;

public class EmpAddAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		EmpVO vo = util.printAddMessage(sc);

		EmpInsertService insertService = new EmpInsertService();
		boolean isInsert = insertService.empInsert(vo);

		// 요청결과에 따라 출력문 작성
		if (isInsert) {
			util.printAddSuccessMessage();

		} else {

			util.printAddFailMessage();

		}
	}

}
