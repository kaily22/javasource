package ch4;

public class ArryaExe16 {

	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, 
		                  { 20, 20, 20 }, 
		                  { 30, 40, 30 }, 
		                  { 40, 50, 20 }, 
		                  { 50, 60, 50 } };

		int result[][] = new int[score.length+1][score[0].length + 1]; //왜 여긴 score[0]?
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				//System.arraycopy(score, 0, result, 0, score.length);
				System.arraycopy(score[i], 0, result[j], 0, score[0].length);
				result[0][3]=result[0][0]+result[0][1]+result[0][2];
				result[1][3]=result[1][0]+result[1][1]+result[1][2];
				result[2][3]=result[0][0]+result[0][1]+result[0][2];
				result[3][3]=result[0][0]+result[0][1]+result[0][2];
				
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
		
		
		}
	}

//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				// 배열 옮기기
//				result[i][j] = score[i][j];
//				// 행 합계
//				result[i][3] += score[i][j];
//				// 열 합계
//				result[5][j] += score[i][j];
//				// 전체 total
//				result[5][3] += score[i][j];
//			}
//		}