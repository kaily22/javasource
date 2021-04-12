package hw;

public abstract class OddDetector {
	private int n;

	public OddDetector(int n) {
		super();
		this.n = n;
	}

	protected int getN() {
		return n;
	}

	public boolean isOdd() { //홀수이면 true리턴
		return true;
	}

}
