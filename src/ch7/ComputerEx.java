package ch7;

public class ComputerEx {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("Calculator의 원 면적 : " + calculator.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원 면적 " + com.areaCircle(r));

	}

}
