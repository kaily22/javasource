package ch1;

/* float / double 실수 데이터 타입 (실수형 - 소수점, 지수 )
 * 4byte = 32 bit (=int)
 * 8byte = 64 bit (=long)
 * 부동 소수점 방식으로 저장되기 때문에 정수와(int, long)달리 훨씬 더 큰 범위의 값 저장 가능
 * 
 * 
 */

public class FloatVarible1 {

	public static void main(String[] args) {
	 //소수점만 사용하는 값이라면 기본적으로 double로 인식됨
	 float score = 3e6f; //컴파일 에러 (문법적으로 틀림)
	 double score2 = 3e6d;	 
	 
	 
	 System.out.println("score = "+score+", score2 = "+score2);
	  
	}

}
