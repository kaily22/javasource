package dept2;

import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

public class DeptSelectAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 서비스에게 요청
		DeptSelectService service = new DeptSelectService();
		List<DeptVO> list = service.getList();

		// 요청 결과에 따라 적절하게 출력
		// 출력 x

		ConsoleUtil util = new ConsoleUtil();
		if (list.isEmpty()) {
			util.printListFailMessage();

		} else {
			util.printListSuccessMessage(list);

		}

	}
}
