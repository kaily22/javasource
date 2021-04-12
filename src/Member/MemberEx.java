package Member;

import java.util.Scanner;

public class MemberEx { // 멤버라는 클래스에 대한 외부 클래스

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// 회원가입, 수정, 삭제 모든 작업들을 맡기기 위해 필요
		MemberConsoleUtil util = new MemberConsoleUtil();
		// 여러명의 회원정보 처리
		Member[] members = new Member[3];
		// members[0] = new Member(2021,"홍길동","서울","대한민국","hong.naver.com",25);

		while (run) {
			System.out.println("=====회원관리 프로그램====");
			System.out.println("1.회원등록");
			System.out.println("2.회원목록보기");
			System.out.println("3.회원정보수정");
			System.out.println("4.회원정보삭제");
			System.out.println("5.프로그램종료");
			System.out.print("메뉴번호 : ");
			int menu = Integer.parseInt(sc.nextLine()); // 1 엔터 "1" =>문자를 int로 바꿔주세요 -> Integer.parseInt("1")

			switch (menu) {
			case 1:
				Member newMember = util.getNewMember(sc);// 멤버 리턴(메인(호출한 곳)으로 보내줌)
				// 배열에 담기
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = newMember;
						break;
					}
				}
				// System.out.println(newMember); // tostring모양으로
				util.printAddSuccessMessage(newMember);
				break;
			case 2:
				util.printMemberList(members);
				break;
			case 3:
				Member updateMember = util.getUpdateMember(sc, members);
				// System.out.println(updateMember);
				if (updateMember != null) {
					util.printModifySuccessMessage(updateMember);
				} else {
					util.printModifyFailMessage();
				}
				break;

			case 4:
				Member deleteMember = util.removeMember(sc, members);
				if (deleteMember != null)
					util.RemoveFailMessage();
				else
					util.RemoveSuccessMessage();
				break;
			case 5:
				run = false;
				break;

			default:
				break;
			}

		}

//	//new Member().getAge();
//		Member member1 = new Member(); //객체 생성
//		Member member2 = new Member(2021,"홍길동","서울","대한민국","hong.naver.com",25); //객체 생성
//		//member.getAge();
//		
//		System.out.println(member1); //메모리 내의 주소
//		System.out.println(member2);
//		
//	

	}

}
