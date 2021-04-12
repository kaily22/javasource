package ch1;

/*char 타입(문자) : 2byte만 사용 -> ' ' 홑 따옴표로 표현
 * 문자열 : String str -> " " 쌍 따옴표로 표현
 * 2byte = 16bit(-2의 15승~ 2의 15승)
 * 문자는 -개념이 없음 -> 2bye = 16bit(0~2의 16 -1) 0~63,535
 * 
 * 문자 vs 문자열
 */

public class CharacterVarible1 {

	public static void main(String[] args) { 
	   
//     ascii 코드 : 컴퓨터 키보드에 있는 문자열을 숫자로 나타낸 값	   
	   char ch = 'A';   //문자
	   char ch2 = 65;  
	   
	   char ch3 = 'a', ch4 = 97;
	   
	   String str = "Ab";  //문자열
	   
	   System.out.println("ch가 가진 값은? = "+ch+", ch2 = "+ch2);
	   System.out.println("ch3 =  "+ch3+", ch4 = "+ch4);
	   System.out.println("str = " +str);
	

	}

}
