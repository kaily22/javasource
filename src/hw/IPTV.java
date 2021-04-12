package hw;

public class IPTV extends ColorTV {

	private String location;

	public IPTV(int size, int color, String location) {
		super(size, color);
		this.location = location;	
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 "+location+ "주소의" );
		super.printProperty();
	}

	}

