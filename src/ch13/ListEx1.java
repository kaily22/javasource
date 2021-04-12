package ch13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		// E : 담아야 할 타입(참조타입)
		// int를 담고싶으면 => Integer(type)

		// List<Integer> List1(다형성때문) = new ArrayList<Integer>();
		ArrayList<Integer> List1 = new ArrayList<Integer>();

		// 요소 추가
		List1.add(1);
		List1.add(10);
		List1.add(100);
		List1.add(1000);
		List1.add(10000);
		List1.add(100000);

		// 확인
		// System.out.println(List1);

		for (Integer i : List1) {
			System.out.println(i);

		}
		
		
		List1.sort(Comparator.reverseOrder());
		
		for (Integer i : List1) {
			System.out.println(i);

		}
	}

}
