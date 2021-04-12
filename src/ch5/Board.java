package ch5;

public class Board {

	// 속성 - 글 번호(1,2,3,4), 제목, 작성자,내용

	int num;
	String title;
	String writer;
	String summary;

	// 생성자 - 기본 생성자, 인자를 모두 받는 생성자,
	public Board() {
		
	}

	public Board(int num, String title, String writer, String summary) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.summary = summary;
	}


	// 메소드

}
