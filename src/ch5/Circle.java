package ch5;

public class Circle {
//속성 : 반지름

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// 기능 : 면적을 구한다. (리턴 타입 : 더블)
	double getArea() {
		return 3.14 * radius * radius;
	}
}
