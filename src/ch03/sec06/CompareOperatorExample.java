package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		boolean result2 = (num1 != num2);
		System.out.println(result2);
		boolean result3 = (num1 <= num2);
		System.out.println(result3);
		
		System.out.println("----------------------");
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		
		System.out.println("----------------------");
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 <= num4);
		System.out.println(result5);
		
		System.out.println("-문자열비교---------------------");
		String str1 = "자바";
		String str2 = "자바";
		//str2 = str2 + "강아지";
		boolean result6 = (str1.equals(str2));
		System.out.println(result6);
		boolean result7 = (str1 == str2);
		System.out.println(result7);
		

		
		
		
//		int num1 = 10;
//		int num2 = 10;
//		boolean result1 = (num1 == num2);
//		boolean result2 = (num1 != num2);
//		boolean result3 = (num1 <= num2);
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		
//		char char1 = 'A';
//		char char2 = 'B';
//		boolean result4 = (char1 <char2);
//		System.out.println("result4 : " + result4);
//		
//		int num3 = 1;
//		double num4 = 1.0;
//		boolean result5 = (num3 == num4);
//		System.out.println("result5 : " + result5);
//		
//		float num5 = 0.1f;
//		double num6 = 0.1;
//		boolean result6 = (num5 == num6);
//		boolean result7 = (num5 == (float)num6);
//		System.out.println("result6 : " + result6);
//		System.out.println("result7 : " + result7);
//		
//		String str1 = "자바";
//		String str2 = "JAva";
//		boolean result8 = (str1.equals(str2));
//		boolean result9 = (! str1.equals(str2));
//		System.out.println("result8 : " + result8);
//		System.out.println("result9 : " + result9);
		
		
	}

}
