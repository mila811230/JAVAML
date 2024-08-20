package ch09.sec03.exam01;


public class A {
	static class B {
			
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
		
		

}
