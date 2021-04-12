package ch4;

public class ArryaExe10 {

	public static void main(String[] args) {
	
	   int array[][]= {{95,86}, {83,92,96}, {78,83,93,87,88}};
	   int total =0, num =0;
	   //합계와 평균을 구하기
	   for(int[] arr:array) {
	       for(int j:arr) {
	           total += j;
	           num++;
	       }
	        System.out.println("전체 점수: " +total+ "평균 : " +total/num);
	         //array.length-> 행열에 걸리기때문에 /3이 된다.
	  	}
    }
}
