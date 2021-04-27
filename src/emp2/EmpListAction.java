package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// Service 호출
		EmpSelectService empService = new EmpSelectService();
		List<EmpVO> list = empService.getEmpList();

		// 받은 리스트를 화면 출력 = util부탁
		ConsoleUtil util = new ConsoleUtil();
		if (!list.isEmpty()) {
			util.printListEmp(list);
		} else {
			util.printListFailMessage();

		}

	}

}
