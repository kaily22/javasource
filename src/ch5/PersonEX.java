package ch5;

public class PersonEX {
	public static void main(String[] args) {
		Person person1 = new Person();

		//person1.nation = "US"; //고정값으로 쓰고싶으면 , final -> 수정x
		person1.name = "hong";
		person1.ssn = "980202-1234566";
		
		System.out.println(Person.NATION);
		//값을 불러올 순 있지만
		// 변경할 순 없다.
		
	}

}
