package ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx6 {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		FileOutputStream out = null;
//        //input에 있는거 읽어서 outputstream에 저장
//		try {
//			File f = new File("C:\\Users\\이승현\\Documents\\승현파일\\blessing.m4a");
//			// 바이트 기반 파일 읽기
//			fis = new FileInputStream(f);
//			// 바이트 기반 화면 출력
//			out = new FileOutputStream("c:\\temp\\blessing2.m4a");
//
//			byte b[] = new byte[100];
//			while (fis.read(b)!= -1) {
//				out.write(b);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally { // exception이 나던 안나던 무조건 실행
//			try {
//				fis.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		File f = new File("C:\\Users\\이승현\\Documents\\승현파일\\blessing.m4a");
		try(FileInputStream fis = new FileInputStream(f); FileOutputStream out  = new FileOutputStream("c:\\temp\\blessing2.m4a");)
		{
			int data = 0;
			while ((data = fis.read()) != -1) {
				out.write(data);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
