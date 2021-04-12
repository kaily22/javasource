package ch5;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
	
	//Board 객체 배열 -> 게시글 3개
	
	Board board[] = new Board[3];
	
	for(int i=0; i<board.length; i++) {
	    
	    board[i]= new Board(); //기본 객체 생성
	}
	    
	    Scanner sc  = new Scanner(System.in);
	    
	    int i = 1; //시작의 의미
	    for(Board boa : board) {
	    	System.out.printf("[%d] 게시글 \n", i++);
	    	System.out.print("num : ");
	    	boa.num = Integer.parseInt(sc.nextLine()); //글번호 + 엔터
	    	
	    	System.out.print("title: ");
	    	boa.title = sc.nextLine(); //버퍼에 남아있는 엔터-> 줄바꿈을 읽어옴
	    	//next -> 하나만 읽어가지고 옴/ 나머지가 또 남아있음
	    	System.out.print("writer : ");
	    	boa.writer = sc.nextLine();
	    	
	    	System.out.print("summary : ");
	    	boa.summary = sc.nextLine();
	    	System.out.println();
	    }
	    //입력 후 출력
	    for(Board boa : board) {
	    System.out.printf("[%d] 게시글 \n", i++);
	    System.out.println("글 번호 : " +boa.num);
	    System.out.println("책 제목 : " +boa.title);
	    System.out.println("글쓴이 : " +boa.writer);
	    System.out.println("책 내용 : " +boa.summary);
	    
	    
	
	
	    }
	}

}
