package ch13;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
	
	char arr[] = {'H','a','p','p','y'};
	
	//배열 복사 - system.arraycopy
	
	char[] arr2 = new char[10];
	System.arraycopy(arr, 0, arr2, 0, arr.length);
	System.out.println(arr2);
	
	char[] arr3 = Arrays.copyOf(arr, arr.length);
	System.out.println(arr3);
	
	
	}

}
