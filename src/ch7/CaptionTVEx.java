package ch7;

public class CaptionTVEx {

	public static void main(String[] args) {
		CaptionTV caption = new CaptionTV();

		caption.channel = 10;
		caption.channelUp();
		System.out.println("현재 채널 : " + caption.channel);
		caption.displayCaption("Hello world!"); //->false
		caption.caption = true;
		caption.displayCaption("Hello world!");
	}

}
