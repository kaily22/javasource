package ch14;

public class Box1 {
	
	//기본타입(int, double, boolean...)
	//참조타입(앞에 대문자 => Account, Car..., Integer,Float)
	//상속 : 왼쪽 부모 = 자식 Object item = 자식
	//Object: 어떤 타입을 던지든 다 가능
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

}
