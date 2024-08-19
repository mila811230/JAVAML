package ch08.sec09;

public class MainExample {

	public static void main(String[] args) {
		ImplementClass impl = new ImplementClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
