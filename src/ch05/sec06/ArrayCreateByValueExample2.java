package ch05.sec06;

public class ArrayCreateByValueExample2 {

	public static void main(String[] args) {
		int [] scores;
		scores = new int[] {83, 90, 87, 70};
		int sum1 = sum(scores);
		for (int i = 0; i < scores.length; i++) {
			sum1 +=scores[i];
		}
		System.out.println("종합 : " + sum1);
		
		printItem(scores);
		//점수 출력

	}
	
	//점수의 합계를 계산하는 메서드
	public static int sum(int[] scores) {
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			// scores.length로 배열의 길이 사용
			sum1 += scores[i];
		}
		return sum1;
		
	}
	
	//점수를 출력하는 메서드
	public static void printItem(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("점수%d : %d \n", i, scores[i]);
			
		}
	}

}
