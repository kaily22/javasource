package ch5;

public class TriangleEx {

	public static void main(String[] args) {
	
	Triangle triangle = new Triangle(10,8);
	
	//면적 구하기(메소드 사용하기)
	System.out.println("삼각형 면적 : " +triangle.getArea());
	
	//밑변 30, 높이 20인 삼각형 객체 생성
	Triangle triangle2 = new Triangle(30,20);
	System.out.println("면적 : " +triangle2.getArea());
	
	}

}
