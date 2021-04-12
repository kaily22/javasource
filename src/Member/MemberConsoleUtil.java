package Member;

import java.util.Scanner;

public class MemberConsoleUtil {

	// 사용자로부터 회원 정보를 입력받은 후 입력받은 회원을 리턴 (객체 생성-> 호출)
	Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");

		System.out.print("아이디 : ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("이메일 :");
		String email = sc.nextLine();
		System.out.print("국가 :");
		String nation = sc.nextLine();
		System.out.print("나이 :");
		int age = Integer.parseInt(sc.nextLine());

		return new Member(id, name, addr, nation, email, age); // 생성자 호출
		// 6개의 정보를 member에 담겠다. //6개의 데이터 => 1개의 객체(Member)
		// 1)객체 생성 2) 값을 담아준다. (member라는 박스에 담아주기)
	}

	void printAddSuccessMessage(Member Newmember) { // 박스를 다시 받음 -> 박스를 열어서 name꺼냄 -> get사용
		System.out.println(Newmember.getName() + "회원 정보 추가 성공");
	}

	void printModifySuccessMessage(Member member) {
		System.out.println(member.getName() + "회원 정보 수정 성공");
	}


	void printModifyFailMessage() {
		System.out.println("회원 정보 수정 실패");
	}

	void RemoveFailMessage() {
	System.out.println("회원 정보 삭제 실패");
	}

	void RemoveSuccessMessage() {
		System.out.println("회원 정보 삭제 성공");
	}

	void printMemberList(Member[] memArr) {
		System.out.println("회원아이디\t  이름\t 주소\t이메일\t\t국가\t나이");
		for (Member member : memArr) {
			if (member != null) {
				System.out.printf("%5d", member.getId());
				System.out.printf("%7s", member.getName());
				System.out.printf("%30s", member.getAddr());
				System.out.printf("%18s", member.getEmail());
				System.out.printf("%6s", member.getNation());
				System.out.printf("%8d\n", member.getAge());
			}
		}
	}

	Member getUpdateMember(Scanner sc, Member[] memArr) {
		System.out.println("수정할 회원의 아이디를 입력하세요 ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 회원의 주소를 입력하세요 ");
		String addr = sc.nextLine();
		System.out.println("수정할 이메일을 입력하세요 ");
		String email = sc.nextLine();

		// 수정 => 회원 아이디가 같은 member 찾기 //members를 통채로 넘겨 받음
		for (int i = 0; i < memArr.length; i++) {
			if (memArr[i].getId() == id) { // getid를 통해 가져옴
				// =>주소, 이메일 변경 setter메소드 이용해서 변경
				memArr[i].setAddr(addr);
				memArr[i].setEmail(email); // 새로 입력받은 email로 바꿈(set->기존에 있는 값 변경/새로 셋팅)
				return memArr[i];
			}

		}
		// 수정된 Member 리턴
		return null; // null을 가짐 return이 memArr이므로
	}

	Member removeMember(Scanner sc, Member[] memArr) {
		System.out.println("삭제할 회원의 아이디를 입력하세요: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("정말로 삭제하시겠습니까? 예(1) 아니오(2)");
		// 비울때 => null(기존 지워짐)
		int menu = Integer.parseInt(sc.nextLine());

		Member deleteMember = null; //변수만 선언
		if (menu == 1) { //1이 들어왔을 때만 삭제
			for (int i = 0; i < memArr.length; i++) {
				if (memArr[i].getId() == id) { //아이디가 같은지 찾아내기
					deleteMember = memArr[i]; //향상된 for문 사용x
					memArr[i] = null;
					return deleteMember;
				}
			}
		}
		return null;
	}
}
