package ch4;

public class ArryaExe1 {

	public static void main(String[] args) {
	 //100명의 점수를 변수에 담아서 처리
     // int score = 100, socr1 = 200, score=150
     
     //배열 선언
     int[] score;
     String name[];
     
     //배열 생성
     score = new int[5];
     name = new String[5];
     
     //초기화
     
     score[0] = 97;
     score[1] = 88;
     score[2] = 89;
     score[3] = 56;
     score[4] = 69;
     
     //String : 기본값 null
     
     name[0] = "park";
     name[0] = "choi";
     name[0] = "lee";
     name[0] = "kim";
     name[0] = "ryu";
     
     
     
     //배열 사용 : int 기본값 : 0
     System.out.println(score[0]);
     System.out.println(score[1]);
     System.out.println(score[2]);
     System.out.println(score[3]);
     System.out.println(score[4]);
     
     //String : 기본값 null
     System.out.println(name[0]);
     System.out.println(name[1]);
     System.out.println(name[2]);
     System.out.println(name[3]);
     System.out.println(name[4]);
     
     
	}

}
