package ch5;

public class MemberCall {
//인스턴스 변수
	int iv = 10;
//클래스 변수 (정적 변수)
	static int cv = 20;

	int iv2 = cv;
//static int cv2=iv; //new를 해야한다.

// MemberCall call = new MemberCall(); 밑이 간단하게 처리

	static int cv2 = new MemberCall().iv;

//static은 static만 부를 수 있음
	static void staticMethod1() {
		System.out.println(cv);
//	System.out.println(iv);  
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1(); -> new다음에
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
