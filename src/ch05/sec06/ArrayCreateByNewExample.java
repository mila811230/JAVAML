package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];
		
		//배열 항목의 초깃값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		
		//배열 항복의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		//배열 항목으 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		//배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		
		//배열 항복의 초깃값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		//배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		//배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		
		//배열 항복의 초깃값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		
		//배열 항복의 값 변경
		arr3[0] = "멍멍이";
		arr3[1] = "냥냥이";
		arr3[2] = "갉갉이";
		System.out.println("-----------------------------------");
		
		//배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println("-----------------------------------");
	
		
		System.out.printf("arr3 : %s \n", + System.identityHashCode(arr3));
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + System.identityHashCode(arr3[i]));
		}
		
		System.out.println("-----------------------------------");
		arr3[0] = "카멜레온";
		arr3[1] = "어흥이";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + System.identityHashCode(arr3[i]));
		}
	}

}















