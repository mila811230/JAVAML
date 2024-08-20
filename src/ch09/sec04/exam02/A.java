package ch09.sec04.exam02;

public class A {
	
	void useB() {
		
		// 로컬 클래스
		class B {
			
			//인스턴스 필드
				int field1 = 1;
			
			//정적필드
				static int field2 = 2;
			
			//생성자
				B() {
					System.out.println("B생성자 실행");
				}
			
			//인스턴스 메소드
				void method1() {
					System.out.println("B메서드1 실행");
					
				}
			
			//정적 메서드
				static void method2() {
					System.out.println("B스테틱 메서드2 실행");
					
				}
			}
			
			//로컬 객체 생성
			B b = new B();
			
			//로컬 객체의  인스턴스 필드와 메소드 사용
			System.out.println(b.field1);
			b.method1();
			
			//로컬 객체의 정적(static)필드 메소 사용예
			System.out.println(b.field2);
			b.method2();
			
			
			
		}

}
