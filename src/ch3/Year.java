package ch3;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("");
	int y = sc.nextInt();
	   if ((y%4 == 0 && y%100 !=0) || y%400==0) {
	      System.out.println("1");
	   }
	   else {
	    System.out.println("0");
	   }
	      
	}

}
