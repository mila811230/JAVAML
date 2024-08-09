package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
//		int score = 85;
//		String grade = (score > 60) ? "합격" : "불합격";
//		System.out.printf("당신의 점수는 %d 점이며, 최종[%s]입니다", score, grade);
		
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'c');
		System.out.println(score + "점은" + grade + "등급입니다");

	}

}
