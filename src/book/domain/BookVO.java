package book.domain;

public class BookVO {

	private int bookcode;
	private String bookname;
	private String writer;
	private int cost;

	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookVO(int bookcode, String bookname, String writer, int cost) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.writer = writer;
		this.cost = cost;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BookVO [bookcode=" + bookcode + ", bookname=" + bookname + ", writer=" + writer + ", cost=" + cost
				+ "]";
	}

}
