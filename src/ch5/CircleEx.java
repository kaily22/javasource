package ch5;

public class CircleEx {

	public static void main(String[] args) {
 //객체 생성
 	Circle circle =new Circle(13.5); //실물로 만들때 new가 생성자 호출
	
	//메소드 호출
	System.out.println("원의 넓이는 : " +circle.getArea());

	}

}
