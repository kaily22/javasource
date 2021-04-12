package ch12;

public class StringEx4 {

	public static void main(String[] args) {
	  String str1 = "abcdefg";
	
	  System.out.println(str1.contains("ab"));
	  
	  String str2 = "자바 프로그래밍";
	  
	  System.out.println(str2.contains("프")? "들어 있음" : "없음");
	
	}
}
