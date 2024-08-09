package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		for(int i = 1; i <=10; i++) {
			float x = i / 10.0f;
			System.out.println(x);
			// 부동 소수점 수는 이진수로 정확하게 표현할 수 없는 소수점 숫자가 있기 때문에, 
			// 예를 들어 0.1f와 0.2f 같은 수를 정확히 표현할 수 없음. 
			// 따라서 x의 값이 1.0f를 초과할 수 있는 상황이 발생할 수 있다.
			// 결론은 정수로 루프를 구현한구 다시 10으로 나누면 된다.
		}
		
		
//		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
//			System.out.println(x);
//		 //이 식은 아주 정확하지 않을 수 있음
//		}

	}

}
