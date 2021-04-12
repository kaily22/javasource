package ch5;

public class CarExe2 {
//static은 static만 가능 => 빼면 객체 생성 무조건 
	public static void main(String[] args) {

		Car car = new Car();
		car.company = "기아";
		car.model = "스포티지";
		car.color = "red";
		car.maxSpeed = 180;
		print(car); //주소값 넘김

		// 인자를 받는 생성자를 이용한 객체 생성
		Car car2 = new Car("현대");
		print(car2); //주소값을 넘김

		Car car3 = new Car("현대", "아반떼");
		print(car3);

		Car car4 = new Car("현대", "람보르기니", 150);
		print(car4);

	}
//참조 변수 가능->주소를 넘겨받음
	public static void print(Car car) { //클래스 이름 ->주소를 넘겨받는거랑 같 -> 갖고있는 값 출력
		System.out.println("제조사 : " + car.company);
		System.out.println("모델 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최대 속도 :" + car.maxSpeed);
		System.out.println();
	}
}
