package user2;

import java.util.Scanner;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.printUpdateMessage(sc);

		UserUpdateService updateservice = new UserUpdateService();
		boolean result = updateservice.UserUpdate(vo.getMobile(), vo.getAddr(), vo.getNo());

		if (result) {
			util.printUpdateSuccessMessage();
		} else {
			util.printUpdateFailMessage();
		}

	}

}
