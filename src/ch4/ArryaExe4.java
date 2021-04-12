package ch4;

public class ArryaExe4 {

	public static void main(String[] args) {
	
	  int score[] = new int[5];
	  
	  int total = 0;
	  
	  //i->0부터 시작해서 0/10/30/60/100
	  //0 score 0 = score 0 + 0 / score 1 = score 1 + 1	  
	  for(int i =0; i<score.length;i++) {
	     score[i]=i*10; //초기화
	     total+=score[i]; //배열 사용
	     System.out.println(score[i]);
	}
	System.out.println("score의 총합 : " +total);
}
}
