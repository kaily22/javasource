package ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStrea2 {

	public static void main(String[] args) {

		// 파일 인풋 : 파일
		// 읽어올 파일 => FileInputStream=>버퍼=>프로그램사용
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\picture1.jpg"));
				FileOutputStream bos = new FileOutputStream("c:\\temp\\picture2.jpg"))
				 {

			int data = 0;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
