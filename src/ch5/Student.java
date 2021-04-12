package ch5;

/*
 * 클래스
 * 클래스 명의 시작은 숫자 x 3Car(X)
 * $, _외의 특수문자는 사용 x @Car(X)
 * 자바 키워드는 사용 x : public, class, switch, for,....x
 * 대문자로 시작(관례) 
 * 서로 다른 단어가 혼합된 이름을 사용할 때는 각 단어의 첫 머리 글자는 대문자로 작성
 * ex)ChatServer
 */
    public class Student {
// 속성 - 학번, 이름, 주소, 핸드폰...... => 필드(멤버 변수, 프로퍼티)

	String id; // 학번(21345018),
	String name; // 이름(홍길동)
	String addr; // 주소(서울시 구로구...)
	String mobile; // 핸드폰(010-////)



//생성자- 클래스명 동일
//    - 개발자가 명시적으로 생성자를 선언x -> 자동으로 컴파일러가 생성
// public Student() {} - 기본 생성자(Default Constructor) 


// 기능 - 전화번호를 변경한다. / 주소를 변경한다. => 메소드
	void changeMobile(String change) {
		this.mobile = change; //-> 넘어온 값을 mobile로 
	}

	void changeAddr(String addr) {
		this.addr = addr;
	}
}
//class Teacher {
//
//}