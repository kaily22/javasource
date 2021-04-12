package hw;

import java.util.Scanner;

public class CalculateEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int result = 0;
		String op;
		System.out.print("Input Num1 : ");
		 a = sc.nextInt();
		System.out.print("Input Num2 : ");
		 b  = sc.nextInt();
		System.out.print("Input operator : ");
		op = sc.next();
		
		Calc calc=null;
		
		switch (op) {
		case "+":
			Add add = new Add();
//			add.setValue(a, b);
//			System.out.println(add.calculate());
			break;
		
		case "-":
			Sub sub = new Sub();
//			sub.setValue(a, b);
//			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
//			mul.setValue(a, b);
//			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
//			div.setValue(a, b);
//			System.out.println(div.calculate());
			break;
		default:
		System.out.println("error");
			break;
		}
		
		calc.setValue(a, b);
		System.out.print(calc.calculate());
		
	}

}
