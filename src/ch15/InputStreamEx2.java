package ch15;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
	public static void main(String[] args) {
	 
	 //바이트 기반/키보드
	 InputStream in = System.in;
	 
	 OutputStream out = System.out;
	 int input = 0;
	 //입력 스트림에서 한 바이트씩 읽어오기
	 try {
	    while((input = in.read())!=-1) {
	    out.write(input);
	    
	    }
	    
	    in.close();
	    out.close();
	    
	} catch (IOException e) { //키보드에서 못 읽어오면
		e.printStackTrace();
	}
	 
	
}

}
