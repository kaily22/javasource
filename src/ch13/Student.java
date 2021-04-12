package ch13;

public class Student implements Comparable<Student>{
	private String name;
	private Integer java;
	
	public Student(String name, Integer java) {
		super();
		this.name = name;
		this.java = java;
	}

	public String getName() {
		return name;
	}
	
	

	@Override
	public String toString() {
		return name + ":" + java;
	}

	@Override
	public int compareTo(Student o) { //정렬 기준(내림, 올림) 앞에서 빼는 형식 : 오름 
		//return this.name.compareTo(o.name); //올림차순
		//return o.name.compareTo(this.name); //내림차순
	
	//java 점수
	//앞에 내꺼에서 새로넘어오는거 -> 오름차순
	
	return this.java.compareTo(o.java);
	}

	}


