package ch3;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  int H, M ;
	  H = sc.nextInt(); 
	  M = sc.nextInt();
	  
	  if(M < 45) {
	     H--;
	     M = (M+60)-45;
	     
	     if(H<0){
	       H=23;
	     }
	     System.out.println(H +" "+M);
	  }
	  else {
	   System.out.println(H+" "+ (M-45));	
	  }
	}     
}

	     