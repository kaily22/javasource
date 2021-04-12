package ch12;

public class StringEx1 {

	public static void main(String[] args) {
		// 문자열 객체 생성
		String str = "Hello"; // 클래스 타입

		// 리턴타입 void =>charAt이고 void가 아니면
		System.out.println(str.charAt(0));
		char ch1 = str.charAt(1);
		System.out.println(ch1);
		System.out.println("문자열 길이 : " + str.length()); // 5

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		char ch[] = { 'H', 'e', 'l', 'l', 'o' };
		String str2 = new String(ch);

		System.out.println(str);
		System.out.println(str2);

	}

}
