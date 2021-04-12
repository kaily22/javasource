package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyEx2 {
	public static void main(String[] args) {
//자동으로 자원 닫기
		try (FileInputStream fis = new FileInputStream("input.txt"); FileOutputStream fos = new FileOutputStream("");) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
