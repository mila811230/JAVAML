package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "길동";
		String name4 = name1;
		String name5 = ("홍" + name3);
		String name6 = ("홍" + name3);
		
		System.out.println("name1 hashCode : " + System.identityHashCode(name1));
		System.out.println("name2 hashCode : " + System.identityHashCode(name2));
		System.out.println("name3 hashCode : " + System.identityHashCode(name3));
		System.out.println("name4 hashCode : " + System.identityHashCode(name4));
		System.out.println("name5 hashCode : " + System.identityHashCode(name5));
		System.out.println("name6 hashCode : " + System.identityHashCode(name6));
		
		System.out.println(name1.equals(name2));
		System.out.println(name1 == (name2));
		System.out.println(name1.equals("홍" + name3));
		System.out.println(name1 == name5);
		System.out.println(name1 == ("홍" + name3));
		System.out.println(name1.equals(name4));

	}

}
