package ch5;

public class Triangle {

//속성

	int baseline;
	int height;

	Triangle(int baseline, int height) {
		this.baseline = baseline;
		this.height = height;
	}

//메소드(기능)
	double getArea() { // 매개변수 x ->메소드가 일이 끝나고 무조건 double타입으로 무언가를 리턴!
		return (baseline * height) / 2;
	}
}
