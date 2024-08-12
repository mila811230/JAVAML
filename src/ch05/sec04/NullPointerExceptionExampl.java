package ch05.sec04;

import java.util.Arrays;

public class NullPointerExceptionExampl {

	public static void main(String[] args) {
		int[] intArr = null;
		if (intArr != null) {
			intArr[0] = 10;
			}
		
		String str = "홍길동";
		System.out.println("intArr(" + intArr + ") => " + Arrays.toString(intArr));
		System.out.println("총 문자 수 : " + str.length());
		

	}

}
