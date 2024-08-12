package ch05.sec07;

public class MultiArrayExample {

	public static void main(String[] args) {
		//1차 배열
		//철수의 국 영 수 1차 점수
		int[] scoreArr1 = {100, 90, 88};
		
		
		//철수의 1차, 2차, 3차, 국 영 수 점수
		int[][] scoreArr2 = {
				{100, 90, 88}, // 철수 1차 국영수
				{80, 70, 98},  // 철수 2차 국영수
				{100, 100, 95} // 철수 3차 국영수
		};
		
		//2반 국 영 수 1차, 2차, 3차 시험점수 (철수, 영희, 말자)
		int[][][] scoreArr3 = {
				{
					{100, 90, 88}, // 철수 1차 국영수
					{80, 70, 98},  // 철수 2차 국영수
					{100, 100, 95} // 철수 3차 국영수
				},//철수
				{
					{50, 70, 65},  //영희 1차 국영수
					{55, 80, 75},  //영희 2차 국영수
					{90, 80, 85}   //영희 3차 국영수
				}, //영희
				{
					{80, 95, 97},  //아이유 1차 국영수
					{98, 92, 95},  //아이유 2차 국영수
					{99, 90, 91}   //아이유 3차 국영수
				} //아이유
		};
		
		
		//철수 1차 영어 점수
		//1차 배열
		System.out.print(scoreArr1[1] + ",");
		//2차 배열
		System.out.print(scoreArr2[0][1] + ",");
		//3차 배열
		System.out.println(scoreArr3[0][0][1] + ",");
		
		//철수 2차 영어 점수
		//1차 배열- 불가능
		//2차 배열
		System.out.print(scoreArr2[1][1] + ",");
		//3차 배열
		System.out.println(scoreArr3[0][1][1] + ",");
		
		//아이유 3차 수학 점수
		//1차 배열- 불가능
		//2차 배열- 불가능
		//3차 배열
		System.out.println(scoreArr3[2][2][2] + ",");
		
		// 철수  국 영 수
		// 1차
		// 2차
		// 3차
		
		System.out.printf("차수 \t 국어 \t 영어 \t 수학 \n");		
		System.out.printf("1차 \t %02d \t %02d \t %02d \n", scoreArr2[0][0], scoreArr2[0][1], scoreArr2[0][2]);		
		System.out.printf("2차 \t %02d \t %02d \t %02d \n", scoreArr2[1][0], scoreArr2[1][1], scoreArr2[1][2]);		
		System.out.printf("3차 \t %02d \t %02d \t %02d \n", scoreArr2[2][0], scoreArr2[2][1], scoreArr2[2][2]);		
		
		for(int i = 0; i<3; i++) {
			System.out.printf("%d차 \t %02d \t %02d \t %02d \n", i + 1, scoreArr2[i][0], scoreArr2[i][1], scoreArr2[i][2]);
		}
		System.out.println("-------------------------------");
		
		
		// 아이유  국 영 수
		// 1차
		// 2차
		// 3차
		
		System.out.printf("차수 \t 국어 \t 영어 \t 수학 \n");		
		System.out.printf("1차 \t %02d \t %02d \t %02d \n", scoreArr3[2][0][0], scoreArr3[2][0][1], scoreArr3[2][0][2]);		
		System.out.printf("2차 \t %02d \t %02d \t %02d \n", scoreArr3[2][1][0], scoreArr3[2][1][1], scoreArr3[2][1][2]);		
		System.out.printf("3차 \t %02d \t %02d \t %02d \n", scoreArr3[2][2][0], scoreArr3[2][2][1], scoreArr3[2][2][2]);		
			
		
		for(int i = 0; i<3; i++) {
			System.out.printf("%d차 \t %02d \t %02d \t %02d \n", i + 1, scoreArr3[2][i][0], scoreArr3[2][i][1], scoreArr3[2][i][2]);
		}
		
		
		
		//	      1차  2차 3차
		//	철수
		//	영희
		//	말자
		System.out.println(" \n \n ");
		System.out.println("3반 국어점수");
		
		System.out.println("-------------------------------");
		
		String[] names = {"철수", "영희", "아이유"};
		System.out.printf("이름 \t 1차 \t 2차 \t 3차 \n");
		
		System.out.println("-------------------------------");
		
		for (int n = 0; n < 3; n++) {
		System.out.printf("%s \t %02d \t %02d \t %02d \n", names[n], scoreArr3[n][0][0], scoreArr3[n][1][0], scoreArr3[n][2][0]);		
		}
	}

}










