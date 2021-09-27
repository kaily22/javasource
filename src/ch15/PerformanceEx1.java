package ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PerformanceEx1 {

	public static void main(String[] args) {
		// FileInputStream vs BufferedInputStream+FileInputStream 같이 썼을때
		// 시간차이

		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")) {

			long start = System.currentTimeMillis();
			while ((fis.read()) != -1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream 사용시 : " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg"); 
		     BufferedInputStream bis = new BufferedInputStream(fis)) {
		     
		     
			long start = System.currentTimeMillis();
			while ((bis.read()) != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream 사용시 : " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
