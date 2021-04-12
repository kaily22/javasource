package ch11;

public class CatchOrderEx2 {

	public static void main(String[] args) {
	
		try {
			// ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			// numberFormatException
			int op1 = Integer.parseInt(data1);
			int op2 = Integer.parseInt(data2);
			System.out.println(op1 + op2);
		//} catch (Exception e) { //다 잡아버림
		//	System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // 받을 수 있는 것만 받음
			//e.printStackTrace();
			System.out.println("매개인자의 개수를 확인하거나, 숫자로 변환이 가능한지 확인해 주세요");
			//Unreachable(도달하지 x => 필요x) catch block for ArrayIndexOutOfBoundsException
		} finally {  
			System.out.println("무조건 수행");
		}

	}
}
