package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListEx3 {

	public static void main(String[] args) {
	
	
	
    List<Integer> list = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("2012~2020년 사이까지 1년 단위로 키(cm)를 입력하세요 : ");
	System.out.println(">>");
	
	String input = sc.nextLine();
	
	StringTokenizer token = new StringTokenizer(input);
	while(token.hasMoreTokens()) {
	  list.add(Integer.parseInt(token.nextToken())); 	
	}
	//between = 차이, pos = 차이가 담겼을때의 자리
	int between = 0, pos=0;
	for(int i=0; i<list.size()-1;i++) {
	   int diff = list.get(i+1) - list.get(i);
	   if(between < diff) {
	     between = diff; //2
	     pos = i; //0
	      
	   }
	}
	System.out.println("가장 키가 많이 자란 년도는  "+(pos+2012)+"년, "+between+" cm");
	
	}

}