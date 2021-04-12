package hw;

public abstract class Calc {

	protected int a;
	protected int b;

	void setValue(int a, int b) {
	this.a = a;
	this.b = b;
	}
 
  abstract int calculate(); //추상 메서드로 작성하라
		
}
