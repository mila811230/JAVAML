package ch03.sec05;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(z1);
		System.out.println(z2);
		
		System.out.println(z1 + 10);
		System.out.println(z2 + 10);
		
		if(Double.isInfinite(z1)) {
			System.out.print("z1 정상적인 값이 아닙니다.");
		} else {
			System.out.println(z1 + 10);			
		}
		
		if(Double.isNaN(z2)) {
			System.out.println("z2 정상적인 값이 아닙니다.");
		} else {
			System.out.println(z2 + 10);			
		}

	}

}
