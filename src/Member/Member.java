package Member;

public class Member { //member 부모 : object

	private int id; //멤버 변수 앞에 private => get.set(외부에서 접근 x)
	private String name;
	private String addr;
	private String nation;
	private String email;
	private int age;

	public Member() {
		super();
	}

	public Member(int id, String name, String addr, String nation, String email, int age) {
		super();
		this.id = id; //내가 가지고 있는 id에 방금 넘어온 id값을 넣어줘.
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", addr=" + addr + ", nation=" + nation + ", email=" + email
				+ ", age=" + age + "]"; //확인용
	}
	
	

}
