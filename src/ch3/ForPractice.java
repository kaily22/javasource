package ch3;

import java.util.Scanner;

public class ForPractice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum =0;
		int total = sc.nextInt();
		for (int i = 0; i < total; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);

		}
	}

}
