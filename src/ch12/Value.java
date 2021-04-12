package ch12;

public class Value {

	int value;
	// 오브젝트 상속받음

	public Value(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		Value v = (Value) obj;
		if (this.value == v.value) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		//멤버 변수 값 확인 용도
	//	return "value = "+value;
	return value+ ""; //value만 주면 오류 => type맞지 않음
	//String 형태로 변경(string뒤에 ""붙여주면)
	}
}
