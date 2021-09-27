package ch15;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx3 {

	public static void main(String[] args) {
	//특정 소스파일을 읽어서 파일 출력
	//행 번호를 붙여서 보여주기
	//문자 => reader쓰는게 좀 더 낫다

		try (FileReader fr = new FileReader("src/ch15/BufferedInputStrea.java");
				BufferedReader br = new BufferedReader(fr)) {
				
	       String str = null;
	       int i = 1;
	       while((str=br.readLine()) != null) {
	          System.out.println(i+ " " +str);
	          i++;
	       }
	
	}
	 catch (Exception e) {	
	  e.printStackTrace();
	 
	 }
	
	}

}
