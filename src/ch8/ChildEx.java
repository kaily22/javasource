package ch8;

public class ChildEx {

	public static void main(String[] args) {
		//자동 타입 변환이 일어나서 객체 생성 => 문제 x
		// 단 오버라이딩 된 메소드가 있ㄷ면 자식 클래스의 메소드가 실행된다.
		Parent parent = new Child(); //child 형태 생성
		//부모의 참조 변수로 접근할 수 있는 범위는 parent 클래스가 가지고 있고
		//있는 메소드로 제한된다. (단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 실행) => 다형성
		parent.method1(); //부모
		parent.method2(); //내꺼
		//child.method3(); 
		//내꺼 //The method method3() is undefined for the type Parent
		// => 강제 형 변환
		
		
		//강제 형 변환
		Child child = (Child) parent; //강제 형변환으로 참조 범위 늘려줌
		child.method3();
		
		//Parent p1 = new Parent(); // 부모꺼만 생성
		//child = (Child) p1; //캐스팅은 가능하지만 p1은 => 실행 할 수 x 범위 =>CAST EXCEPTION 
		//자동 형 변환이 일어나는 것만 => 캐스팅이 다시 가능하다.
		
	}


}
