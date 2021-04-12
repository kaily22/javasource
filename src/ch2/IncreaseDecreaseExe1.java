package ch2;


//증감 연산자 : ++, -- => +1,-1
// ++a, a++, --a, a-- 
// ++a, --a : 다른 연산을 수행하기 전에 피연산자의 값을 +1 or -1시킴
// a++, a-- : 다른 연산을 수행한 후에 피연산자의 값을 +1 or -1시킴

public class IncreaseDecreaseExe1 {

	public static void main(String[] args) {
	
	  //a = a+1;
	  
	  int x = 10, y = 20;
	  
	  x++; // x=x+1
	  y++; // y = y+1
	  
	  System.out.println("x =" +x);
	  System.out.println("y =" +y);
	   
	   
	  ++x; //x=x+1
	  ++y; //y=y+1
	  
	  System.out.println("x= "+x);
	  System.out.println("x= "+y);
	}

}
