package ch02.sec01;

//public class VariableUseExample {
//
//	public static void main(String[] args) {
//		int hour = 3;
//		int minute = 5;
//		System.out.println(hour + "시간" + minute + "분");
//		
//		int totalMinute = (hour * 60) + minute;
//		System.out.println("총" + totalMinute + "분");
//
//	}
//
//}


import java.util.Scanner;

public class VariableUseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간을 입력하세요: ");
        int hour = scanner.nextInt();

        System.out.print("분을 입력하세요: ");
        int minute = scanner.nextInt();

        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");

        scanner.close();
    }
}