package ch13;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<Member>();
		members.add(new Member("hong12", "hong123"));
		members.add(new Member("kong12", "kong123"));
		members.add(new Member("jong12", "jong123"));
		members.add(new Member("gong12", "gong123"));

		// System.out.println(members);

		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPassword());
			System.out.println();
		}

		for (Member member : members) {
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPassword());
			System.out.println();

		}

	}

}