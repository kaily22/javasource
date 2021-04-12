package ch10;

public class Audio implements RemoteControll {
//필드
private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int volume) {
	if(volume > RemoteControll.MAX_VOLUME) {
	this.volume = RemoteControll.MAX_VOLUME;
	}else if(volume < RemoteControll.MIN_VOLUME) {
	this.volume = RemoteControll.MIN_VOLUME;
	}else {
	this.volume = volume;
	}
	System.out.println("현재 TV 볼륨 : " +this.volume);
	}
}

