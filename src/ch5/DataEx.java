package ch5;

public class DataEx {

	public static void main(String[] args) {
	
	    Data data=new Data();
	      data.x = 10; //생성자 안쓰고 직접 접근해 초기화
	      
	      System.out.println("main() : x=" +data.x);
	      //change(data); // 받을때도 data타입으로 받아야
	      change(data.x); // 실제 값을 보내는 경우는 그대로 받아야 
	      System.out.println("After change(data.x)");
	      System.out.println("main() : x=" +data.x); //data.x =>10값

	   }
//	   static void change(Data obj) { //동일한 타입
//	      obj. x=1000; // 이름 그대로 접근하는 게 가능
//	      System.out.println("change() : x="+obj.x);
//	   }

//	   
	   static void change(int x) { //복사가 되어서
	      x=1000;
	      System.out.println("change() : x="+x);
	   }
	}