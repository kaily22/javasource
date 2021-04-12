package ch12;

public class StringEx6 {

	public static void main(String[] args) {
	
	String ssn = "880815-1234567";
	
	//substring(시작위치, 끝나는 위치) : 문자열 추출
	System.out.println(ssn.substring(0, 6));
	System.out.println(ssn.substring(7));
	
	
	//int를 string으로 바꾸려고 씀 => String 10+""
	//String valueOf(10)
	//static 메소드 =>string.
	System.out.println(String.valueOf(false)); //"false"로 들어옴
	System.out.println(String.valueOf(10.5)); // "10.5"로
	System.out.println(String.valueOf(12)); //"12"
	System.out.println(String.valueOf('c')); //"c"
	
	
	String str1 = String.join("-", "java","is","cool");
	System.out.println(str1);
	
	String str2 = "aaa"; //97
	String str3 = "bbb"; //98 
	String str4 = "ccc"; //99
	//compareTo() : 문자열 사전 순서로 비교
	System.out.println(str2.compareTo(str3)); //97에서 98을 뺌 : -1
	System.out.println(str3.compareTo(str2)); //1
	
	System.out.println(str2.compareTo(str4)); //-2

    //toUpperCase, toLowerCase
    
   String str5 = "abcdefg";
   System.out.println(str5.toUpperCase());
   
   String str6 = "ABCDEFG";
   System.out.println(str6.toLowerCase());
   
   //trim()
   String str7 = "     ABC    deFG    ";
   System.out.println(str7);
   System.out.println(str7.trim());  //"  abc".equals("abc") =>false
   
	}

}
