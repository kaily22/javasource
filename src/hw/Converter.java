package hw;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src); //추상 메서드 -> 자식에서 

	abstract protected String getSrcSTring(); //추상 메서드

	abstract protected String getDestStirng(); //추상 메서드

	protected double ratio; //비율

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcSTring() + "을\t" + getDestStirng() + "로 바꿉니다.");
		System.out.print(getSrcSTring() + "\t입력하세요>> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + getDestStirng() + "입니다.");
		sc.close();
	}

//	private double covert(double val) {
//		return 0;
//	}

	//protected abstract double covert(double val);
}
