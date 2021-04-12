package ch6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	//싱글톤 패턴
	//private Time() {}
	

	public void setHour(int hour) {
		// set멤버 변수 이름 : 멤버변수의 값을 변경

		if (hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}
// get 멤버 변수 이름 : 멤버 변수의 값을 가져올 때 사용 =>getter 메소드
	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;}
		this.minute = minute;
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		this.second = second;

	}

	public int getSecond() {
		return second;
	}
}
