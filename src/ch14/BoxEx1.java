package ch14;

public class BoxEx1 {

	public static void main(String[] args) {
	//자주 바뀌는 형변환 => 성능 x

		Box1 box = new Box1();
		
		box.setItem("홍길동"); //box.setitem(new String("홍길동"))
		System.out.println(box.getItem()); // String object = (String)box.getitem();
		
		box.setItem(33);
		System.out.println(box.getItem()); //Integer object = (Integer)box.getitem();
		
		box.setItem(33.14f);
		System.out.println(box.getItem());
		
		box.setItem(true);
		System.out.println(box.getItem());
	}

}
