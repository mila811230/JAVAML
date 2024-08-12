package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.printf("연산전 x :%d, y :%d \n", x, y);
		
		
		System.out.println("++x = " + ++x);
		System.out.println("y++ = " + y++);
		System.out.printf("최종 x :%d, y :%d \n", x, y);
		System.out.println("\n");
		
		x = 10;
		y = 10;
		System.out.printf("계산전 x :%d, y :%d \n", x, y);
		
		System.out.println("--x = " + --x);
		System.out.println("y-- = " + y--);
		System.out.printf("최종 x :%d, y :%d \n", x, y);

	}

}
