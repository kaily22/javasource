package ch12;

public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;

	}
	

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		if (this.id.equals(m.id)) {
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	

}
