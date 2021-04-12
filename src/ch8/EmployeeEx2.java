package ch8;

public class EmployeeEx2 {

	public static void main(String[] args) {

		Worker worker = new Worker();

		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		worker.work(employee); // Employee employee = employee;

		//Employee ceo = new Ceo(); // 자동 형변환
		 Ceo ceo= new Ceo();
		ceo.setName("김동호");
		ceo.setPosition("사장");
		worker.work(ceo); // Employee employee = ceo;

		//Employee admin = new Admin();
		Admin admin = new Admin();
		admin.setName("정우성");
		admin.setPosition("관리자");
		worker.work(admin); // Employee employee = admin;

		//Employee part = new PartTime(); // 접근 할 수 있는 범위=> 부모가 가지고 있는 범위=> 오버라이딩 => 자식 => 자동 형변환에 의해서 => 결과가 다름
		PartTime part = new PartTime();
		part.setName("송혜교");
		part.setPosition("시간제");
		worker.work(part); // Employee employee = part;
	}

	public static void work(Employee employee) {
		employee.work();
		// work -> 오버라이딩 => 결과 다른 결과 -> 다형성
	}

}
