package ch12;

public class StringEx12 {

	public static void main(String[] args) {
		String str1 = "AbZquartKgu";

		// 문자열 거꾸로 출력하기

		// 문자열을 거꾸로 출력해주는 함수
		for (int i = str1.length()-1; i >= 0; i--) {
			System.out.println(str1.charAt(i));
		} 
		
		System.out.println();

		// str1 => StringBuilder변경 후
		StringBuilder str = new StringBuilder(str1);
		System.out.println(str.reverse());

	}

}
