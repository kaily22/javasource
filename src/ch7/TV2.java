package ch7;

public class TV2 {
//속성(필드, 멤버변수, 프로퍼티)
//색상(red, blue) ,전원상태(on, off) ,채널(11, 6....)
	String color;
	boolean power;
	int channel;



public TV2(String color, boolean power, int channel) {
		super(); //object => 모든 클래스들의 부모
		this.color = color;
		this.power = power;
		this.channel = channel;
	}




//동작(메소드)
//전원을 켠다/끈다    채널 변경
	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDonw() {
		channel--;
	}

}
// captionTV-색상, 전원상태, 채널, 캡션상태 , power(), 채널 변경(), 캡션 보여주기
// 새로 다 만들것이냐, TV()에서 상속