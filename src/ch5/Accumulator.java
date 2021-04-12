package ch5;

public class Accumulator {
//필드(인스턴스 필드)
	int total = 0;
//정적 필드(초기화를 한다) => 생성되는 위치가 다름 => 바로 사용 가능
	static int grandTotal = 0; //공통으로 사용

	void accumulate(int amount) { //new를 한 다음
		total += amount; //인스턴스 필드 값을 변화
		grandTotal += amount; //정적 필드 값을 변화

	}

}
