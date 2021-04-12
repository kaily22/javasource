package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListEx2 {

	public static void main(String[] args) {

		List<Double> list1 = new ArrayList<Double>();

		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 실수를 입력하세요 :");
		String num = sc.nextLine();

		StringTokenizer token = new StringTokenizer(num);
		while (token.hasMoreTokens()) {
			list1.add(Double.parseDouble(token.nextToken()));

		}

		double max = 0;
		for (Double value:list1) {
			if (max < value) {
				max = value;
			}
		}
     
        System.out.println("가장 큰 수는"  +max);
	
	 
	
	
		}

}
