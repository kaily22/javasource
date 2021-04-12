package ch2;

public class Pencil {
	public static void main(String[] args) {
	//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때
	// 학생 당 몇개를 가질 수 있고, 최종적으로 몇 개가 남는지 출력
	// 변수명은 임의로 설정 가능
	
	int pen = 534; 
	int result = pen / 30;
	System.out.println("학생당 몇 개를 가질 수 있을까? : " +result);
	
	int result2 = pen % 30;
	System.out.println("최종적으로 몇 개가 남을까? : " +result2);
	
	}

}

// int pencils = 534, students = 30;
//   system.out.println("학생 한 명당:? " +(pencils/stduents));
//  system.out.println("남은 연필수: ? " +(pencils% sutdents)); 