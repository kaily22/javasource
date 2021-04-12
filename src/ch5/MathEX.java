package ch5;

public class MathEX {

	public static void main(String[] args) {
		//인스턴스 변수는 반드시 new 호출에서 생성
		MyMath math = new MyMath();
		math.a=100;
		math.b=200; 
		System.out.println(math.add());
		System.out.println(math.sub());
		System.out.println(math.mul());
		System.out.println(math.divide());

       //클래스(정적(메소드 호출
		System.out.println(MyMath.add(300, 500));
		System.out.println(MyMath.sub(500, 300));
		System.out.println(MyMath.mul(300, 500));
		System.out.println(MyMath.divide(200, 100));
	}

}
