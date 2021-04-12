package ch12;

import java.util.Scanner;

public class WrapperEx1 {
	public static void main(String[] args) {
		// 기본타입 -int, byte short, long, char, float, double, boolean
		// 참조타입 -Integer, Byte, Short, Long, Char,Float, Double, Boolean


        int val = 10;
		Integer i = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");

		int a = Integer.parseInt("10"); 

		double d = Double.parseDouble("3.141592");
		Scanner sc = new Scanner(System.in);

		Character c = Character.valueOf('C');

		Boolean b = Boolean.valueOf("true");

		Integer i3 = 10;// auto boxing

		int val2 = i3; // wrapper타입 //언박싱

	}

}
