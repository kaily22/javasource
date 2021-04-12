package ch13;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx7 {

	public static void main(String[] args) {
	
	Character arr[] = {'a','q','c','r','z','o','b','f','g','s'};
	
	//정렬 전
	for(char ch : arr) {
	System.out.print(ch +" ");
	}
	
	//정렬
	//Arrays.sort(arr);
	Arrays.sort(arr, Comparator.reverseOrder());
	System.out.println();
	
	//정렬 후
	for(char ch : arr) {
		System.out.print(ch +" ");
		}
		
	}

}
