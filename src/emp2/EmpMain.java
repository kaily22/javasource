package emp2;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1.특정 사원 조회|2.전체 사원 조회|3.사원 입력|4.사원 수정|5.사원 삭제|6.종료");
			System.out.println("-----------------------------------------------------------------------------");

			System.out.print("번호입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());

			Action action = null;

			switch (menu) {
			case 1:
				action = new EmpSelectAction();
				break;
			case 2: // 왼쪽 부모 = 자식(상속)
				action = new EmpListAction();
				break;
			case 3:
				action = new EmpAddAction();
				break;
			case 4:
				action = new EmpUpdateAction();
				break;
			case 5:
			    action = new EmpRemoveAction();
			    break;
			case 6:
				run = false;
			}
			if (action != null) {
				action.execute(sc);
			}
		}

	}

}
