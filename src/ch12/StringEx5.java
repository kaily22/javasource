package ch12;

public class StringEx5 {

	public static void main(String[] args) {
	String str1 = "자바 객체 지향 언어입니다. 자바는 풍부한 API를 제공하빈다.";
	
	str1 = str1.replace("자바", "java"); //바꾼 걸 새로운 객체로 받기
	//원본=>다시 담아야한다.
    //System.out.println(str2);	
    
    System.out.println(str1);	
    str1 = str1.replaceFirst("java", "자바"); //첫번재 찾은 것만 원하는 걸로 변경
    System.out.println(str1);
	
	String str2 = "hello";
	String str3 = "hello";
	String str4 = "Hello";
	//대소문자 구별
	System.out.println(str2.equals(str3));
	System.out.println(str2.equals(str4));
//System.out.println(str2.equalsIgnoreCase(str3));
	System.out.println(str2.equalsIgnoreCase(str4));
	
	
	}

}
