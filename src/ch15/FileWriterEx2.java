package ch15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterEx2 {

	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 출력하는 프로그램 작성
		// 조건 : 키보드에서 q가 입력되기 전까지 계속 받아들이도록 한다.
		// 입력값을 처리할 때 Scanner 을 사용

		try (Scanner sc = new Scanner(System.in);
			FileWriter f = new FileWriter("c:\\temp\\output6.txt");
			BufferedWriter bw = new BufferedWriter(f)) {
					
			System.out.println("입력하세요 ");
			System.out.println("중단하려면 q를 입력해 주세요");
			String input = null;
			do {
				System.out.print(">> ");
				input = sc.nextLine();
				
				if(!input.equalsIgnoreCase("q")) {
				bw.write(input);
				bw.newLine();
				}
				
			} while (!input.equalsIgnoreCase("q"));
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
