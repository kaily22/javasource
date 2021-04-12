package ch5;

public class Numbers {

	int num[];

	public Numbers(int[] num) { //생성자 이름 = 클래스 이름 /리턴타입 x
		super();
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int i : num) { //대입받을 변수 정의. 배열명
			total += i;
		}

		return total;

	}

	int getAverage() {

		return getTotal() / num.length;

	}

}
