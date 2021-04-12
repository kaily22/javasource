package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Finally : 열어둔 자원을 닫는 목적
public class FinallyEx {
	public static void main(String[] args) {
//FileNotException => checked Exception(컴파일 단계에서 알려줌)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("input.txt"); //file을 input로 읽어들어옴
			fos = new FileOutputStream("output.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 수행 - 자원 해제
			try { //자원 생성할때마다 닫아줘야함
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
