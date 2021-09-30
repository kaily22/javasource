import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	
	
	
	System.out.print("문자 한 자를 입력하세요 : ");
	Scanner sc = new Scanner(System.in);
	
	char ch = sc.nextLine().charAt(0);
	
	if(ch >= 'A' && ch<='Z') {
	  System.out.println((char)(ch + ('a'- 'A')));
	}else if(ch >= 'a' && ch <= 'z') {
	
	  System.out.println((char)(ch-('a'+'A')));
	}else {
	
	  System.out.println("영문자가 아닙니다.");
	}
	
	
	
	}

}
