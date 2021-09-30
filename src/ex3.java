import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
	
	  System.out.print("연도를 입력하세요>>");
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int year = sc.nextInt();
	  
	  if(year % 4  == 0 || year % 400 == 0) {
	    System.out.println("윤년");
	  }else {
	     System.out.println("평년");

	  }
	
	}

}
