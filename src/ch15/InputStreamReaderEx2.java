package ch15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
	//읽어올 파일 -> input or fileinput -> inputreader변경 -> 프로그램 처리
	//try-with-resource 방식으로 

	
	try(InputStreamReader fis = new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"));
	    FileWriter fos = new FileWriter("c:\\temp\\output3.txt")){
		 
		 
		 int data = 0;
		 while((data=fis.read())!=-1) {
		  fos.write(data);		 
  	 
	  }
	} catch (Exception e) {
		// TOsDO: handle exception
	}

	}

}
