package ch4;

public class ArryaExe3 {

	public static void main(String[] args) {

		int score[] = { 97, 88, 89, 56, 69 };
		String name[] = { "park", "kim", "choi", "Lee" };

		System.out.println("score.length " + score.length);

//	 for(int i =0; i<score.length;i++) {
//	  System.out.print(name[i]+"\t");
//	  System.out.println(score[i]);

		// 향상된 for문
		for (int s : score) { // 변수명 임의로 지정
			System.out.println(s);
		}

		for (String n : name) {
			System.out.println(n);
		}

	}
}
