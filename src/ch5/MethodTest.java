package ch5;

/*메소드
 * 리턴타입 메소드명(매개변수) {}
 * 
 * 메소드명은 숫자로 시작하면 안되고, $,_만 가능
 * 소문자로 시작(관례)
 * 서로 다른 단어가 혼합된 사애이면 뒤이어 오는 단어의 첫머리 글자는 대문자
 * ex)getName() -> 뒤에 글자가 대문자로
 * 
 */

public class MethodTest {
//리턴타입 true, false / 메소드 명은 isRedirect /매개변수는 x

	boolean isRedirect() {
		return true;

	}

//정수 리턴, 두개의 정수 타입의 매개변수, 전달 받은 매개변수의 합 리턴
	int sum(int a, int b) {
		return a + b;
	}

	// 정수 리턴(long), 위와 같 / 곱
	long multiply(int a, int b) {
		return a * b;
	}
// 문자 리턴, 매개x, method1,문자열 A리턴
	char method1() {
		return 'A';
	}
	//실수(double), 두개의 실수 타입 매개변수 ,divide, 전달받은 매개변수의 나누기 리턴
	
	double divide(double a, double b) {
		return a / b;
	} 
	//정수형 배열 리턴, 하나의 정수 타입의 배열, getArr, 
	int[] getArr(int[] arr) {
		return arr;
	}
	
	// 문자열 리턴,
	String getName(String name) {
		return name;
	}
	void print() {
	 // return;
	}
}
