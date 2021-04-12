package ch4;

public class ArryaExe7 {

	public static void main(String[] args) {
	   int scores[][]= { {15,25},{45,55,65}}; //크기를 맞출 필욘x
	   
	   int englishScores[][] = new int[2][]; //열은 확정 할 수 없음, 열의 개수가 다르기 때문에
	   englishScores[0]= new int[2]; //첫번째 행 : 2개
	   englishScores[1]= new int[3]; //두번째 행 : 3개
	   
	   for(int score[] : scores) { // int score[]-> 15,25,35를 가져와서 score로 넣어줌 :(배열명)
	      for(int j:score) {
	         System.out.println(j+"\t");
	      }
	      System.out.println();
	   
//	   
//	   for(int i=0; i<scores.length; i++) {
//	      for(int j=0; j<scores[i].length; j++) {
//	          System.out.print(scores[i][j]+"\t");
//	}


	 System.out.println();
	 
	   }
	}
}
