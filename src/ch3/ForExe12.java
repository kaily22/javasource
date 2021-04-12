package ch3;
// 정수 12345를 선언하고 각 자릿수를 더한 결과를 출력하기
//1+2+3+4+5 = 15
public class ForExe12 {
	public static void main(String[] args) {
		int num = 12345; //초기값 이미 줌
		
		int sum = 0;
	    for(;num!=0;) { //증감은 의미가 없음, 나머지 값으로 진행
	      sum+= num%10; //5+4+3
	      num = num/10;  //1234
	  }
	  System.out.println("각 자리 수의 합: "+sum);
	}
 
}
