package ch3;

import java.util.Scanner;

public class DoWhileExe2 {
//1~100이의 임의의 숫자를 입력받아 하나 생성
// 생성된 숫자를 사용자가 맞추기
//생성된 숫자보다 사용자의 입력값이 더 크면 작은 수 입력 메세지 출력
//반대의 경우에는 더 큰 수 입력하기 메시지ㅣ 출력

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지를 입력하세요 ");
		System.out.println("프로그램 종료를 원하면 q 입력");
		String input;
	    
	    do  { //한번은 입력을 받고 입력받은걸 비교해서 
	      System.out.print(">>" );
	      input = sc.nextLine();
	    } while(!input.equals("q"));
	    
	    System.out.println("프로그램 종료!!!!");
	    
	}

}
