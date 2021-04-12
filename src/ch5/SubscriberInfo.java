package ch5;

public class SubscriberInfo {
	// 가입자 정보 클래스
	// 속성-이름(홍길동), 아이디(hong123), 패스워드(hon123@@#@), 전화번호(01012345667), 주소

	String name;
	String id;
	String passwd;
	String mobile;
	String addr;

//기본 생성자, 생성자(이름,아이디,패스워드), 전체속성 초기화
	public SubscriberInfo() {
		super();
	}

	public SubscriberInfo(String name, String id, String passwd) {
		super();
		this.name = name;
		this.id = id;
		this.passwd = passwd;
	}

	public SubscriberInfo(String name, String id, String passwd, String mobile, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.passwd = passwd;
		this.mobile = mobile;
		this.addr = addr;
	}

//메소드
	void ChangePwd(String change) {
		this.passwd = change;
	}

	void SetTel(String set) {
		this.mobile = set;
	}

	void SetAddr(String set2) {
		this.addr = set2;
	}
}
