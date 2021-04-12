package ch4;

public class ArryaExe13 {

	public static void main(String[] args) {
	    if(args.length!=2) {
	       System.out.println("프로그램 사용법");
	       System.out.println("java 클래스명 인자 1 인자2");
	       System.exit(0); //프로그램 종료
	       
	    }
	    //문자로 들어오는 숫자를 int로 변경하고 싶으면 
	    int strNum1 = Integer.parseInt(args[0]); 
	    int strNum2 = Integer.parseInt(args[1]);
	    
	    System.out.println(strNum1+", "+ strNum2);

	}

}
