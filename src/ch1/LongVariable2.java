package ch1;
/*
 * long = 8 byte -> 64bit (-2의 63~2의 63) 
 * 
 */


public class LongVariable2 {

	public static void main(String[] args) {
	     
	     long var1 = 123456789; //소문자, 대문자 ㅣ,L옵션
	     
	     // int 타입의 저장 범위를 넘어서는 정수 값에는 L을 반드시 붙여야 함 
	     long ver2 = 1000000000000L;

	     System.out.println("var1 : =  " +var1); 
	  
	  
	}

}
