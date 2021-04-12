package ch10;

public class ImplementationEx {

	public static void main(String[] args) {
	  ImplementationC impl = new ImplementationC();
	  
	  InterfaceA ia = impl; //왼쪽 부모 역할 가능, 오른쪽 자식일때
	  ia.methodA(); 
	
	  
	  InterfaceB ib = impl;
	  ib.methodB();
	  
	  InterfaceC ic = impl; //c는 문제 없이 가능
	  ic.methodA();
	  ic.methodB();
	  ic.methodC();
	}

}
