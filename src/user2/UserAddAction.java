package user2;

import java.util.Scanner;

import ch14.Util;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) {

		ConsoleUtil util = new ConsoleUtil();
		UserVO vo = util.printAddMessage(sc);

		UserAddService addservice = new UserAddService();
		boolean isAdd = addservice.add(vo.getUsername(), vo.getBirthYear(), vo.getAddr(), vo.getMobile());
		if (isAdd) {
			util.printAddSuccessMessage();

		} else {
			util.printAddFailMessage();
		}

	}

}
