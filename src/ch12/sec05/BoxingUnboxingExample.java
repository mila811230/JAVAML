package ch12.sec05;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		int value = obj;
		System.out.println(value);
		
		int result = obj + 100;
		System.out.println(result);
		
	}

}
