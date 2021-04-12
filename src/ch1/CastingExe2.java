package ch1;

public class CastingExe2 {

	public static void main(String[] args) {
	   int num1 = 123456780;
	   int num2 = 123456780; 
	   //23bit안에 123456780 표현 x
	   
	   //자동 형변환
      //float : 4byte, 부호를 표현하는데 1bit, 지수를 표현: 8bit, 실제 숫자 표현 : 나머지 bit
	   float num3 = num2;
	   
	   //double : 부호(1bit), 지수(11bit), 가수(52bit)
	   //double num3 = num2;
	   System.out.println("num3 = " +num3);
//	  강제 형변환
	   num2 = (int) num3;
	   
	   int result = num1 - num2;
	   System.out.println("result = " +result);

	}

}
