package ch12.sec11;

import java.lang.reflect.*;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 1
//		Class clazz1 = Car.class;
		
		// 2
//		Class clazz = Class.forName("ch12.sec11.Car");
		
		// 3
		Car car = new Car();
		Class clazz = car.getClass();
		
		
		System.out.println("패키지" + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름" + clazz.getSimpleName());
		System.out.println("클래스 전체 이름" + clazz.getName());
		
		
		// 생성자 읽기
		System.out.println("생성자 정보-------------------------------");
		Constructor[] constructors = clazz.getConstructors();
		
		for(Constructor constructor : constructors) {
			String strParams = "";
			Class[] params = constructor.getParameterTypes();
			
			for(int i = 0; i < params.length; i++) {
				if(strParams.length() > 0) {strParams += ",";}
				strParams += params[i].getSimpleName() + " " + params[i].getName();
		}
		
			System.out.println(constructor.getName() + "(" + strParams + ")");
		
	}	
		
		
		//필드 읽기
		System.out.println("필드 정보-------------------------------");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
			
		}
	
	}

}
