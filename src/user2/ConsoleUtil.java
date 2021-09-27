package user2;

import java.util.List;
import java.util.Scanner;


public class ConsoleUtil {

	public UserVO printAddMessage(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.print("회원 이름 입력 >> ");
		vo.setUsername(sc.nextLine());
		System.out.println("생일 입력 >> ");
		vo.setBirthYear(Integer.parseInt(sc.nextLine()));
		System.out.print("주소 입력 >> ");
		vo.setAddr(sc.nextLine());
		System.out.print("핸드폰 번호 입력>>");
		vo.setMobile(sc.nextLine());

		return vo;
	}

	public void printAddSuccessMessage() {
		System.out.println("삽입 성공");
	}

	public void printAddFailMessage() {
		System.out.println("삽입 실패");
	}

	// 특정 회원 조회 메시지 출력
	public int getUser(Scanner sc) {

		System.out.println("조회할 회원 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());
	}

//특정 회원 조회시 정보
	public void printGetMessage(UserVO vo) {
		System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
		System.out.print(vo.getNo() + "\t");
		System.out.print(vo.getUsername() + "\t");
		System.out.print(vo.getBirthYear() + "\t");
		System.out.print(vo.getAddr() + "\t");
		System.out.print(vo.getMobile() + "\n");

	}

//전체 정보 조회
	public void printSelectMessage(List<UserVO> list) {

		System.out.println("\n번호\t이름\t태어난해\t주소\t모바일");
		for (UserVO vo1 : list) {
			System.out.print("no : " + vo1.getNo() + "\t");
			System.out.print("Username : " + vo1.getUsername() + "\t");
			System.out.print("birthYear : " + vo1.getBirthYear() + "\t");
			System.out.print("Addr : " + vo1.getAddr() + "\t");
			System.out.print("mobile : " + vo1.getMobile() + "\n");
		}
	}

	// 전체 정보 조회 실패
	public void printListFailMessage() {
		System.out.println("요청하신 정보가 없습니다.");
	}

	// 회원 수정 정보 메세지
	public UserVO printUpdateMessage(Scanner sc) {
		
		UserVO vo = new UserVO();
		
		System.out.println("수정하고 싶은 사원 번호 입력: ");
		vo.setNo(Integer.parseInt(sc.nextLine()));
		System.out.println("수정할 주소 입력 : ");
		vo.setAddr(sc.nextLine());
		System.out.println("수정할 전화번호 입력 : ");
		vo.setMobile(sc.nextLine());
		
		return vo;
	}

	// 수정 성공 메세지
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}

	public void printUpdateFailMessage() {
		System.out.println("수정 실패 ");
	}

	public UserVO printDeleteMessage(Scanner sc) {
		UserVO vo = new UserVO();
		System.out.println("삭제할 사원번호 입력 : ");
		vo.setNo(Integer.parseInt(sc.nextLine()));

		return vo;

	}

	public void printDeleteSuccessMessage() {

		System.out.println("삭제 성공");
	}

	public void printDeleteFailMessage() {
		System.out.println("삭세 실패");
	}

}
