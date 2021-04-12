package ch2;

public class ArthemethicOperation {

	public static void main(String[] args) {
	      
	   int v1 = 5;
	   int v2 = 2;
	   int result = v1 + v2;
	   System.out.println("result : " +result);
	   
	   int result2 = v1 - v2;
	   System.out.println("result2 : " +result2 );
	   
	   int result3 = v1 * v2;
	   System.out.println("result3 : " +result3 );
	   
	   int result4 = v1 / v2; // 몫만 출력
	   System.out.println("result4 : " +result4 );
	   
	   int result5 = v1 % v2; //나머지
	   System.out.println("result5 : " +result5 );	   
	   
	   double result6 = v1 / v2; // 몫만 출력 -> 2를 나누고 그걸 담고 double 타입으로 바꿈
	   System.out.println("result6 : " +result6 );
	   
	   double result7 = (double)v1 / v2; // ->casting
	   System.out.println("result7 : " +result7 );
	}

}
