package ch11;

public class CheckedException {
	public static void main(String[] args) throws ClassNotFoundException {
	//throws => 예외를 떠 넘김 
	//컴파일 예외 - CheckedException
	//ClassNotFoundException
	findClass();

	}
	static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}
