package ch05.sec08;

public class ArrayStringExample {

	public static void main(String[] args) {
		String[] strArray = new String[6];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		strArray[3] = new String("java");
		strArray[4] = new String("java");
		strArray[5] = strArray[0];
		
//		int iTempo = System.identityHashCode(strArray[0]);
//		System.out.println("Array[0] : " + iTempo);
//		iTempo = System.identityHashCode(strArray[1]);
//		System.out.println("Array[1] : " + iTempo);
//		iTempo = System.identityHashCode(strArray[2]);
//		System.out.println("Array[2] : " + iTempo);
//		iTempo = System.identityHashCode(strArray[3]);
//		System.out.println("Array[3] : " + iTempo);
//		iTempo = System.identityHashCode(strArray[4]);
//		System.out.println("Array[4] : " + iTempo);
		
//		String[] newArray = strArray;  얕은복사
		
		//깊은 복사
//		String[] newArray = new String[6];
//		for (int i = 0; i < newArray.length; i++) {
//			newArray[i] = strArray[i];
//		}
		
		String[] newArray = new String[6];
		System.arraycopy(strArray,  0, strArray, 0, 6);
		
		printArr(strArray);
		printArr(newArray);
		strArray[0] = "C++";
		newArray[0] = "C#";
		newArray[2] = "delphy";
		printArr(strArray);
		printArr(newArray);

		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2]));
		System.out.println(strArray[2] == strArray[3]);
		System.out.println(strArray[2].equals(strArray[3]));
		System.out.println(strArray[1] == strArray[4]);
		System.out.println(strArray[1].equals(strArray[4]));
	}

	public static void printArr(String[] Arr) {
		for (int idx = 0; idx <Arr.length; idx++) {
			int iTempo = System.identityHashCode(Arr[idx]);
			System.out.printf("주소 : %d, 값 : %s \n", iTempo, Arr[idx]);
		}
			System.out.println("----------------------------");
		
	}
}








