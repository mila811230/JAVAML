package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Service.class;
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			printLine(printAnnotation);
			method.invoke(new Service());
			printLine(printAnnotation);
			System.out.print("\n\n");
			
		}
		
	}

	public static void printLine(PrintAnnotation printAnnotation) {
		String value = printAnnotation.value();
		int number = printAnnotation.number();
		
		for(int i = 0; i < number; i++) {
			System.out.print(value);
		}
		System.out.println();
	}
	
}

	


