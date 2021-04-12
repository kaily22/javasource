package ch5;

public class StudentEx {

	public static void main(String[] args) {
	//객체 생성-> 메모리에 힙을 쓴다./항상 메인이 있는 곳에서 실행
	Student student = new Student();
	
	//초기화
	student.name = "홍길동";
	student.id = "20170012";
	student.mobile = "010-5104-6324";
	student.addr = "서울시 강남구"; 

    //확인
    System.out.println("학번 : "+student.id);
    System.out.println("이름 : "+student.name);
    System.out.println("주소 : "+student.addr);
    System.out.println("구 전화번호 : "+student.mobile);
	
	//전화 번호 변경 => 메소드 호출
	
	student.changeMobile("010-1234-5678");
	System.out.println("신 전화번호 : " +student.mobile);
	
	
	}

}

