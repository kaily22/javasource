package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {

		List<String> List1 = new ArrayList<String>();

		List1.add("java");
		List1.add("java");
		List1.add("jdbc");
		List1.add("oracle");
		List1.add("jsp");
		List1.add("servlet");

		System.out.println(List1);
		// 배열에서의 length와 같음 = list1.size()
		System.out.println("size " + List1.size());
		List1.remove(0); // 순서가 존재 => 0번에 있는걸 지움
		System.out.println(List1);
		
		//아이템 찾기
		System.out.println("mybatis위치 "+List1.indexOf("mybatis"));
		
		//특정위치의 요소 가져오기
		System.out.println("특정 요소 가져오기 " +List1.get(1));
		
		
		for(String s : List1) {
		     System.out.println(s);
		}
	}

}
