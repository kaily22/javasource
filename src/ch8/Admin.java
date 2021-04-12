package ch8;

public class Admin extends Employee {

	@Override
	public void work() {
		System.out.println(super.getName() + " " 
		+super.getPosition() + "이 일합니다.");
	}

}
