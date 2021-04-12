package ch3;
//임의의 정수를 입력받아 해당 수의 factorial구하기
// 4=>4*3*2*1

import java.util.Scanner;

public class ForExe10 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("숫자를 입력하세요 : ");
      int n = sc.nextInt();
      
      int fact = 1;
      for(int i = 1; i<=n; i++) {
          fact = fact*i; // fact*=1;
      }
      System.out.println(n+" ! = " +fact); 
 }

}

