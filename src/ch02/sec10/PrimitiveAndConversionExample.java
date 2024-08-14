package ch02.sec10;

public class PrimitiveAndConversionExample {

	public static void main(String[] args) {
//		int intValue = Integer.parseInt("10");
//		System.out.println(intValue);
//		
//		double doubleValue = Double.parseDouble("10.123");
//		System.out.println(doubleValue);
//		
//		boolean boolValue = Boolean.parseBoolean("True");
//		System.out.println(boolValue);
//		
//		String strTempo = String.valueOf(10);
//		System.out.println(strTempo + 10);
//		
//		strTempo = String.valueOf(3.14);
//		System.out.println(strTempo + 10);
//		
//		strTempo = String.valueOf(true);
//		System.out.println(strTempo + 10);
		
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

	}

}
