package ch7;

public class CaptionTV2 extends TV2 {

	boolean caption;
	
	public CaptionTV2(String color, boolean power, int channel, boolean caption) {
		super(color, power, channel);
		this.caption = caption; //내 생성자 생성
	}
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
