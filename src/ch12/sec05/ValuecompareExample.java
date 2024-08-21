package ch12.sec05;

public class ValuecompareExample {

	public static void main(String[] args) {
		
		Integer obj1 = 10;
		Integer obj2 = 10;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Integer obj3 = 210;
		Integer obj4 = 210;
		
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));

	}

}
