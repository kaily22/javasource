package ch12;

public class StringEx2 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		// 문자열에 '프'가 있는지 확인하기
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '프') {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "들어있음" : "없음");
	}
}
