package ch13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
	   String fruit[] = {"사과", "포도","딸기","자두","수박"}; 
	   //기존 배열 : 추가 x => 배열 다시 잡고 기존에 입는거 옮겨주고 추가
	   
	   List<String> List1 = Arrays.asList(fruit);
	   
	   System.out.println(List1);
	   
	   //List1.add("메론"); //java.lang.UnsupportedOperationException(런타임 익셉션)
	   
	   List<String> list2 = new ArrayList<String>(Arrays.asList(fruit));
	   list2.add("메론");
	   System.out.println(list2);	
	}

}