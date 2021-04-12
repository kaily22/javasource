package ch13;

import java.util.HashSet;
import java.util.Set;

/*
 * Set
 * 저장 순서가 유지되지 않음(나오는 순서랑 들어가는 순서가 일치 x) -> 번호 x
 * 객체를 중복해서 저장할 수 없음
 * 
 */
public class SetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("java");
		set.add("git");
		set.add("jdbc");
		set.add("MySQL");
		set.add("swing");

		System.out.println(set);

		System.out.println("jdbc 포함 여부 : " + set.contains("jdbc"));
		System.out.println("set 크기 : " + set.size());
		System.out.println("특정 객체 삭제 : " + set.remove("swing"));
		System.out.println(set);

		for (String str : set) {
			System.out.println(str);
		}

	}

}
