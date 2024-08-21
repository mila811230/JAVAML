package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		
		String data = "자바"; //utf-8
		
		
		//utf-8 => byte[]
		byte[] arr1 = data.getBytes();
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		
		// byte[] => utf-8
		String str1 = new String(arr1);
//		String str1 = new String(arr1, "UTF-8");
		System.out.println("str1 : " + str1);
		
		// utf-8 스트링 => byte[] (euc-kr)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// utf-8 스트링 => byte[] (euc-kr)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("str2:"+str2);
		
		
		
		
	}

}
