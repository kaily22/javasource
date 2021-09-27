package user2;

import java.util.Scanner;

public class UserSelectAction implements Action {

	@Override
	public void execute(Scanner sc) {
		ConsoleUtil util = new ConsoleUtil();

		int no = util.getUser(sc);

		UserSelectOneService selectoneService = new UserSelectOneService();
		UserVO vo = selectoneService.getUser(no);

		util.printGetMessage(vo);

	}

}
