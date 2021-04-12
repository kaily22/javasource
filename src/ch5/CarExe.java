package ch5;

public class CarExe {

	public static void main(String[] args) {

    Car car = new Car();
    car.company = "기아";
    car.model = "스포티지";
    car.color = "red";
    car.maxSpeed = 200;
    
    
    System.out.println("제조사 : " +car.company);
    System.out.println("모델 : " +car.model);
    System.out.println("색상 : " +car.color);
    System.out.println("최대 속도 :"  +car.maxSpeed);


	}
}
