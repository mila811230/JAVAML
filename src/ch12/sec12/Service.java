package ch12.sec12;

public class Service {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용 1");
	}
	
	
	@PrintAnnotation(value = "#")
	public void method2() {
		System.out.println("실행 내용 2");
	}
	
	
	@PrintAnnotation(value = "*", number = 25)
	public void method3() {
		System.out.println("실행 내용 3");
	}
	
	
	

}
