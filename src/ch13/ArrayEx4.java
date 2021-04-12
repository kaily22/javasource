package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx4 {

	public static void main(String[] args) {
		String arr[] = { "good", "height", "apple", "piano", "zero" };

		// 정렬 전
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		// 오름차순 정렬
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.reverseOrder());
		// 정렬 후

		for (String s : arr) {
			System.out.print(s + " ");
		}

	}

}
