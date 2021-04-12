package ch11;

public class CastException {

	public static void main(String[] args) {
		Dog dog = new Dog();
		change(dog);

		Cat cat = new Cat();
		// java.lang.ClassCastException:
		change(cat);
	}

	public static void change(Animal animal) {
	//instanceof => 확인해서 해결
	
	if(animal instanceof Dog) { //변경될 수 있는 type인지 확인 후 바껴라
		Dog dog = (Dog) animal;
	 }
	
	}

}
