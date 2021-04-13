package ch14;

//Box1 클래스를 Generics 적용 후 -> 어떻게 변하나?

//Generics : 
//다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시 타입 체크
//타입 안전성/타입 체크와 형변환을 생략할 수 있으므로 코드가 간결
//Object => T(Type)로 변환
//E: element(하나의 요소)
//K : key
//V : value

public class Box2<T>  { //Box2<> => 타입을 하나 지정하고 써라

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
