package ch3;

import java.util.Scanner;

public class ForExe4 {

	public static void main(String[] args) { 
	    //2단을 출력	    
	   Scanner sc = new Scanner(System.in);
	   System.out.print("출력할 구구단을 입력하세요: ");
	   int num = sc.nextInt();
	      for(int j=1;j<10;j++) {
	       System.out.printf("%d * %d = %d\n", num,j, (num*j));
	   }
	  }
	
}
