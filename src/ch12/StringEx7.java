package ch12;

public class StringEx7 {

	public static void main(String[] args) {
	String str1 = "abcdefghijkl";
	
	// 문자열 => char[] (리턴타입이 char 배열)
    
   // System.out.println(str1.toCharArray());  
    char[] arr1 = str1.toCharArray();
    
    for(char ch : arr1) {
    System.out.println(ch);
 
    }
      
	}

}
