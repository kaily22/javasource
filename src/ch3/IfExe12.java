package ch3;

import java.util.Scanner;

public class IfExe12 {

	public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   int height, weight, average;
	   System.out.print("키를 입력하세요 : " );
	   height = sc.nextInt();
	   System.out.print("몸무게를 입력하세요 : ");
	   weight = sc.nextInt();
	   
	   average = (int) ((height-100)*0.9);
	   
       if(weight > average) {
         System.out.println("과제충");
       }
       else if(weight < average) {
         System.out.println("저체중");
       }
       else {
         System.out.println("표준");
       }
          
        
        
	}

}
