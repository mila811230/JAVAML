package ch09.sec02.exam01;

public class A {
	
	class B {
		
		//인스턴스 변수
		int field1 = 1;
		
		//정적 변수
		static int field2 = 2;
		
		//생성자
		B() {
			System.out.println("B 클래스 생성자 실행");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B 메소드 1 실행");
			
		}
		static void method2() {
			System.out.println("B 스테틱 메소드 2 실행");
			
		}
	}
	
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		
		System.out.println(B.field2);
		B.method2();
		
		
	}
	
	B field = new B();
	
	A() {
		
		B b = new B();
	}
	
	void method() {
		
		B b = new B();
	}

}
