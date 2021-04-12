package ch1;

/* float / double 실수 데이터 타입 (실수형 - 소수점, 지수 )
 * 4byte = 32 bit (=int)
 * 8byte = 64 bit (=long)
 * 부동 소수점 방식으로 저장되기 때문에 정수와(int, long)달리 훨씬 더 큰 범위의 값 저장 가능
 * 
 * 
 */

public class FloatVariable3 {

	public static void main(String[] args) {
	 //float와 double은 정밀도 부분에서 차이가 남
	 float score = 0.123457890123456789f; //컴파일 에러 (문법적으로 틀림)
	 double score2 = 0.1234567890123456789;
	 
	 
	 System.out.println("score = "+score+", score2 = "+score2);
	  
	}

}
