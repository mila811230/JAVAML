package ch12.sec03.exam02;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(3, "홍길동");
		
		System.out.printf("s1 %d \n", s1.hashCode());
		System.out.printf("s2 %d \n", s2.hashCode());
		System.out.printf("s3 %d \n", s3.hashCode());
		
		System.out.printf("s1 == s2 : %s \n", s1 == s2);
		System.out.printf("s1.hashCode == s2.hashCode : %s \n", s1.hashCode() == s2.hashCode());
		System.out.printf("s1.equals(s2) : %s \n", s1.equals(s2));
		System.out.printf("s1.equals(s3) : %s \n", s1.equals(s3));
		
		System.out.printf("s1 %s \n", s1.toString());
		System.out.printf("s2 %s \n", s2.toString());
		System.out.printf("s3 %s \n", s3.toString());
		
		

	}

}
