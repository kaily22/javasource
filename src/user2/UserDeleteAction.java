package user2;

import java.util.Scanner;

import user.UserDeleteService;

public class UserDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.printDeleteMessage(sc);

		UserDeleteService deleteservice = new UserDeleteService();
		boolean isDelete = deleteservice.removeUser(vo.getNo());

		if (isDelete) {
			util.printDeleteSuccessMessage();

		} else {
			util.printDeleteFailMessage();
		}

	}

}
