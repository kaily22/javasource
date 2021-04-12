package ch12;

public class PersonEx {

	public static void main(String[] args) {
	Person person1 = new Person("200" , "이승현");
	Person person2 = new Person("300" , "미나리");
	Person person3 = new Person("200" , "이승현");
	
	//getclass(): 현재 클래스의 정보, getName():패키지명
	System.out.println(person1.getClass().getName());
	
	System.out.println(person1.equals(person2));
	System.out.println(person1.equals(person3));
	
	//toString() : 주소값 출력
	//멤버 변수의 값을 출력 용도
	//ch12.Person@4d95d2a2 
	System.out.println(person1.toString());
	System.out.println(person2.toString());
	System.out.println(person3.toString());
	
	
 }
}