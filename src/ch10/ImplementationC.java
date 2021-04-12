package ch10;

public class ImplementationC implements InterfaceC {
//클래스 => 추상 메소드 모두 상속된다. 오버라이딩 다 함
	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	@Override
	public void methodC() {
		System.out.println("methodC");
		// TODO Auto-generated method stub

	}

}
