package ch15;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
	 
	 //바이트 기반/키보드
	 InputStream in = System.in;
	 OutputStream out = System.out;
	 int input = 0;
	 //입력 스트림에서 한 바이트씩 읽어오기
	 //read => byte 배열 써야 빠름
	 byte[] b = new byte[100]; 
	 try {
	 //입력 스트림에서 지정된 byte 수만큼 읽어오기
	    while(in.read(b)!=-1) {
	    out.write(b);	    
	    }
	    in.close();
	    out.close();
	} catch (IOException e) { //키보드에서 못 읽어오면
		e.printStackTrace();
	}
	 
	
	}

}
