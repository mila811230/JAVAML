package ch04.sec03;

import java.util.Scanner;
public class Switch1Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
//		int num = Integer.parseInt(input) / 10;
//      이경우 switch (num){}으로 실행해야함
		// 90 => A, 80 => B
		System.out.println("입력한 점수 :" + num);
		
		switch (num / 10) {
		case 10 : 
		case  9 :
			System.out.println("A");
			break;
		case  8 :
			System.out.println("B");
			break;
		case  7 :
			System.out.println("C");
			break;
		case  6 :
			System.out.println("D");
			break;
		default : 
			System.out.println("F");
			break;
		
		}
		
		scan.close();

	}

}
