package ch3;

import java.util.Scanner;

public class DoWhileExe1 {
//1~100이의 임의의 숫자를 입력받아 하나 생성
// 생성된 숫자를 사용자가 맞추기
//생성된 숫자보다 사용자의 입력값이 더 크면 작은 수 입력 메세지 출력
//반대의 경우에는 더 큰 수 입력하기 메시지ㅣ 출력

	public static void main(String[] args) {
	    
	    int input = 0;
	    int answer = (int) (Math.random()*100)+1;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    do  {
	      System.out.println("1~100사이의 정수 입력");
	      input = sc.nextInt();
	      
	      if(answer < input) {
	          System.out.println("더 작은 수 입력");
	      }else {
	         System.out.println("더 큰 수 입력");
	      }
	    } while(input!=answer);
	    
	    System.out.println("정답!!!!!");
	    
	}

}
