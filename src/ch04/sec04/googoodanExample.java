package ch04.sec04;

public class googoodanExample {

	public static void main(String[] args) {
		for (int i = 0; i < 64; i++) {
			int dan = (i / 8) + 2;
			int n = (i % 8) + 2;
			System.out.printf("%d * %d = %d \n", dan, n, dan * n);
			
		}

	}

}
