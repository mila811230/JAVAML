package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// 순버ㄴ, 과정, 내용, 강사
		
		String board = "1, 자바학습, 참조타입 string을 학습한다, 홍길동";
		
		String [] tokens = board.split(",");
		System.out.printf("제목 : %s", tokens[1]);
		
		
		String [] titles = {"번호", "제목", "내용", "성명"};
		for(int i = 0; i < titles.length; i++) {
			System.out.printf("%s : %s \n", titles[i], tokens[i]);
		}
		
		
		
		
		//번호 : 1
		//제목 : 자바학습
		//내용 : 참조타입 String을 학습한다.
		//성명 : 홍길동
		
		
	}

}
