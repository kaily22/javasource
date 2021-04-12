package ch5;

public class CalculatorEx {

	public static void main(String[] args) {
	//객체를 생성하는 구문(자동으로 기본 생성자가 호출)
	Calculator cal = new Calculator();
	
	//메소드를 호출
	
	cal.powerOn();
	
	//System.out.println(cal.plus(35, 45));
	int result = cal.plus(35, 45); //-> result로
	System.out.println(result);
	
	double result2 = cal.divide(80, 20);
	System.out.println(result2);
	
	}
}
