package ch10;

public interface RemoteControll {
//멤버변수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

//추상메서드

	void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) { //일반 메소드
		if (mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}

	static void changeBattery() {
		System.out.println("건전지 교체");
	}

}