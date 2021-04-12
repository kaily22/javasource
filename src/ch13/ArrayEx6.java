package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx6 {

	public static void main(String[] args) {
		Integer arr[] = { 37, 21, 56, 99, 88, 58, 62, 15, 36, 78 };
        
        //정렬 전
		for (int i : arr) {
			System.out.print(i+ "\t");
		}
		
		//정렬 - 내림차순
		//sort(T[] a,.....) : T배열: 참조타입
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		
		System.out.println();

       //정렬 후
		for (int i : arr) {
			System.out.print(i+ "\t");
		}
      
	}

}
