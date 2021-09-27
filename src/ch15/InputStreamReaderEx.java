package ch15;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
	//읽어올 파일 -> input or fileinput -> inputreader변경 -> 프로그램 처리
	//try-with-resource 방식으로 

	
	try(InputStreamReader fis = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"))){
		 
		 
		 int data = 0;
		 while((data=fis.read())!=-1) {
		   System.out.println((char)data);
		 
  	 
	  }
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
