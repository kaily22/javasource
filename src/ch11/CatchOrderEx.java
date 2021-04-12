package ch11;

public class CatchOrderEx {

	public static void main(String[] args) {
//try 단독 x
//try : exception 나는 코드
//catch : exception을 받아서 처리
//finally : 예외랑 상관 없이 프로그램이 반드시 실행해야 하는 코드 위치

//		try {
//			String data1 = args[0];
//			String data2 = args[1];
//			System.out.println("data1 = " + data1);
//			System.out.println("data2 = " + data2);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//	 	  //개발할 떄 주로 사용
//		 // e.printStackTrace();
//		  //대문자로 시작 : 클래스 or Interface
//		 
//		 //오류에 대한 메세지 확인 -사용자, 개발
//		 //System.out.println(e.getMessage());
//		 
//		 //사용자 확인 메세지
//		 System.out.println("배열의 개수를 확인해 주세요: ");
//		}
//		
		try {
			// ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			// numberFormatException
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			System.out.println(op1 + op2);
		} catch (ArrayIndexOutOfBoundsException e) { // 받을 수 있는 것만 받음
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			// 예외가 왜 나는지
		} finally {
			System.out.println("무조건 수행");
		}

	}
}
