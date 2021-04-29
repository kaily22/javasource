package dept2;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	public int deptGet(Scanner sc) {//

		System.out.println("부서 번호를 입력하세요 :");
		int deptno = Integer.parseInt(sc.nextLine());
		return deptno;
	}

	// vo내용을 출력하는 메소드
	public void printGetMessage(DeptVO vo) {
		System.out.println("deptno\tdname\tloc");
		System.out.print(vo.getDeptno() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getLoc() + "\n");

	}

	// vo가 널일때 출력하는 메소드
	public void printGetFailMessage(int deptno) {
		System.out.println(deptno + "부서 번호를 확인해 주세요");
	}

	// list 비어 있을 때 출력
	public void printListFailMessage() {
		System.out.println("조회할 내용 없음");
	}

	// list 내용이 있을 때 출력
	public void printListSuccessMessage(List<DeptVO> list) {
		for (DeptVO vo1 : list) {
			System.out.print(vo1.getDeptno() + "\t");
			System.out.print(vo1.getDname() + "\t");
			System.out.print(vo1.getLoc() + "\n");
		}

	}
//새로운 부서 정보 입력받기

	public DeptVO printAdd(Scanner sc) {
		DeptVO vo1 = new DeptVO();
		System.out.println("\n부서정보 입력: ");

		System.out.print("부서번호 >> ");
		vo1.setDeptno(Integer.parseInt(sc.nextLine())); // 90

		System.out.print("부서명 >> ");
		vo1.setDname(sc.nextLine());
		System.out.print("부서위치 >> ");
		vo1.setLoc(sc.nextLine());

		return vo1;
	}

	// 새 부서 추가가 잘 된 경우
	public void printAddSuccessMessage() {

		System.out.println("입력 성공");
	}

	// 새 부서 추가가 안 된 경우
	public void printAddFilMessage() {
		System.out.println("입력 실패");
	}

	// 수정할 정보 입력받기
	public DeptVO printUpdate(Scanner sc) {
		System.out.println("\n부서 정보 수정");
		System.out.println("수정할 부서 번호 입력 >>");
		DeptVO vo = new DeptVO();
		vo.setDeptno(Integer.parseInt(sc.nextLine()));
		System.out.println("수정할 지역명 입력 >>");
		vo.setLoc(sc.nextLine());

		return vo;
	}

//수정 잘 된 경우
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}
//수정 실패 된 경우
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}

//삭제 정보 입력
	public int printDelete(Scanner sc) {
		System.out.println("\n부서 정보 삭제");
		System.out.println("삭제할 부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());

	}
//삭제 성공 시 메세지 출력
	public void printDeleteSuccessMessage() {
		System.out.println("삭제 성공");
	}
//삭제 실패 시 메세지 출력
	public void printDeleteFailMessage() {
		System.out.println("삭제 성공");
	}
}
