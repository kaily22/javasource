package ch6;

public class Car {
	private int speed;
	private boolean stop;

	public double getSpeed() {
		return speed*1.6;
	}

	public void setSpeed(int speed) {
		if (speed < 0)
			return;
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
