package user2;

import java.util.List;
import java.util.Scanner;

public class UserSelectAllAction implements Action {

	@Override
	public void execute(Scanner sc) {

		UserSelectAllService allservice = new UserSelectAllService();
		List<UserVO> list = allservice.listAll();

		ConsoleUtil util = new ConsoleUtil();
		
		if (!list.isEmpty()) {
			util.printSelectMessage(list);
		} else {
			util.printListFailMessage();
		}

	}

}
