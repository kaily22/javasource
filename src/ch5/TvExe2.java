package ch5;

public class TvExe2 {

	public static void main(String[] args) {
		// 객체 생성
		TV tv = new TV();

		tv.color = "Red";
		tv.power = true;
		tv.channel = 7;

		tv.channelUp();
		print(tv);

		// 색상 white

		TV tv2 = new TV("white");
		print(tv2);
		// 확인

	}

	public static void print(TV tv) {
		System.out.println("색상: " + tv.color);
		System.out.println("전원: " + tv.power);
		System.out.println("채널: " + tv.channel);
		System.out.println();
	}
}