package ch12.sec03.exam01;

public class MemberExample {

	public static void main(String[] args) {
		
		Member mbr1 = new Member("홍길동");
		Member mbr2 = new Member("홍길동");
		Member mbr3 = new Member("고길동");
		User usr1 = new User("홍길동");
		
		System.out.printf("1 == 2 => %s\n", mbr1.equals(mbr2) );
		System.out.printf("1 == 2 => %s \n", mbr1.equals(mbr2));
		System.out.printf("1 == 2 => %s \n", mbr1 == mbr2);
		System.out.printf("1 == 3 => %s \n", mbr1.equals(mbr3));
		System.out.printf("mbr1 == usr1 => %s\n", mbr1.equals(usr1) );
		
		System.out.printf("mbr1 hashcode : %d \n", mbr1.hashCode());
		System.out.printf("mbr2 hashcode : %d \n", mbr2.hashCode());
		System.out.printf("mbr3 hashcode : %d \n", mbr3.hashCode());
		System.out.printf("usr1 hashcode : %d \n", usr1.hashCode());
	}

}
