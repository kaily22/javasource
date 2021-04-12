package ch4;

public class ArryaExe2 {

	public static void main(String[] args) {
		// 배열 선언, 생성

		int score[] = new int[5];
		String name[] = new String[5];

		// 초기화
		score[0] = 97;
		score[1] = 88;
		score[2] = 89;
		score[3] = 56;
		score[4] = 69;

		// String : 기본값 null

		name[0] = "park";
		name[1] = "choi";
		name[2] = "lee";
		name[3] = "kim";
		name[4] = "ryu";
		
		
		System.out.println("score.length " +score.length);
		for(int i=0; i<score.length;i++) {
		   System.out.println(score[i]);
		}
	}

}
