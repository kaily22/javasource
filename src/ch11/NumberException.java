package ch11;

public class NumberException {

	public static void main(String[] args) {
	String data1 = "100";
	String data2 = "100a";
	
	
	int value1 = Integer.parseInt(data1);
	//NumberFormatException
	int value2 = Integer.parseInt(data2);
	
	System.out.println(value1 + value2);
	}	

}
