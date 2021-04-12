package ch5;

public class StudentEx2 {

	public static void main(String[] args) {

		// 객체 배열

		Student student1 = new Student();
		student1.id = "1234";
		student1.addr = "서울";
		student1.mobile = "01012345678";
		student1.name = "홍길동";

		Student student2 = new Student();
		student2.id = "1254";
		student2.addr = "부산";
		student2.mobile = "01013345678";
		student2.name = "김길동";

		Student student3 = new Student();
		student3.id = "1235";
		student3.addr = "울산";
		student3.mobile = "01032345678";
		student3.name = "김기투";

		Student stuArr[] = new Student[3]; // 공간만 마련
		
		for(int i =0; i<stuArr.length; i++) {
		    stuArr[i] = new Student();
		}	
		stuArr[0].id = "1234";
		stuArr[0].id = "1234";
		stuArr[0].id = "1234";
		stuArr[0].id = "1234";
		stuArr[0].id = "1234";
		

	}

}
