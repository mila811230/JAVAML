package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램에서 종료하시려면 q를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String strInput = " ";
		
//		do {
//			System.out.print(" > ");
//			strInput = scan.nextLine();
//			System.out.print(strInput);
//			
//		} while (strInput.equals("q") == false);
		
		
		while (true) {
			System.out.print(" > ");
			strInput = scan.nextLine();
			if (strInput.equals("토끼")) {
				continue;
			}
			
			System.out.print(strInput);
			if (strInput.equals("q")) {
				break;
			}
		
		}
	}

}
