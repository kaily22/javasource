package ch12;

public class StringEx8 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		// 출력문 : 1+2+3+4+5 =

		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.valueOf(str.charAt(i))); // '1','2',...(Char)타입=> "1","2","3"...
		}
		System.out.println(sum);

	}
}
