package ch05.sec05;

public class Equals2Example {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		System.out.println("strvar1 hashCode : " + System.identityHashCode(strVar1));
		System.out.println("strvar2 hashCode : " + System.identityHashCode(strVar2));
		
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		System.out.println("strvar3 hashCode : " + System.identityHashCode(strVar3));
		System.out.println("strvar4 hashCode : " + System.identityHashCode(strVar4));
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
