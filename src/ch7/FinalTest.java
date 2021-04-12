package ch7;
//클래스 앞에 final => 상속 금지
final class FinalTest { //사용하고 싶으면 => new사용
	final int MAX_SIZE = 10;

String str;

//final이 메소드에 붙으면 => 오버라이딩 금지
	final int getMAX_SIZE() {
	   final int LV = MAX_SIZE;
		return MAX_SIZE;
	}

}
