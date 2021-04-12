package ch1;

//변수의 유효범위 - 선언된 블록 내에서만 사용 가능
public class VariableScope1 {
	public static void main(String[] args) {
	int value = 15; //value는 main만 안 벗어나면 ok
	//int v2;
	{
	//v2는 블록 벗어날 수 없음 -> 블록 이외에 사용하면 error
	 
	   int v2 = value + 20;
	   System.out.println(v2);
	}
	// System.out.println(v2); ->여기서는 컴파일 에러
 }

}
