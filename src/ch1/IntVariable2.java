package ch1;

/* int 타입 : 4byte
 * 4byte = 32bit (-2의 31승 ~ 2의 31승 -1) : -2,147,483,648 ~ 2,147,438,658
 *
 * 
 * byte, char, long, int, short : 정수형 데이터 담을 때 사용
 */


public class IntVariable2 {

	public static void main(String[] args) {
	
	   int var1 = 10;
	   int var2 = 012; //8
	   int var3 = 0xA; //16
	   System.out.println("변수 값 = " +var1);
	   System.out.println("변수 값 = " +var2);
	   System.out.println("변수 값 = " +var3);

	}

}
