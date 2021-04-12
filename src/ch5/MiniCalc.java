package ch5;

public class MiniCalc {

	int plus(int x, int y) { //plus 부른 곳으로 return 
		return x + y; //4번 : 17이 넘어옴 -> 메소드가 호출된 곳으로 돌아가기
	} 

	double avg(int x, int y) { //x=7,y=10;
		double sum = plus(x, y); //3번 plus(x,y) => 5번 : sum = 17을 받음  형변환이 일어난다.
		return sum / 2; //6번
	}
	
	void execute() { //1번이 되서 실행
	   double result = avg(7,10);//2번  //7번 8.5
	      println("실행 결과:  " +result); //8번
	}
	   
	   void println(String message) { //8번(실행결과가 message로)
	      System.out.println(message); //9번 출력
	   }
	   

}
