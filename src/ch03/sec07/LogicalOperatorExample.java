package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = '7';
		if((65<=charCode) && (charCode<=90)) {
			System.out.printf("%c 는 대문자임\n", charCode);
		} 
		if((97<=charCode) && (charCode<=122)) {
			System.out.printf("%c 는 소문자임\n", charCode);
		} 
		if((48<=charCode) && (charCode<=57)) {
			System.out.printf("%c 는 수자형 문자임\n", charCode);
		} 
		
		int num = 12;
		if( num%2 == 0) {
			System.out.printf("%d 는 2의 배수임\n", num);
		}
		if( num%3 == 0) {
			System.out.printf("%d 는 3의 배수임\n", num);
		}
		//목적이 2의 배수이면서 3의 배수인지 체크
		if( num%2 == 0 && num%3 == 0) {
			System.out.printf("%d 는 2와3 모두의 배수임\n", num);
		}
		
		
		//목적이 2의 배수이거나 3의 배수인지 체크
		if( num%2 == 0 || num%3 == 0) {
			System.out.printf("%d 는 2와3의 배수중 한개이상입니다.\n", num);
		}
		
		
		
		
//		int charCode = 'A';
//
//		
//		if( (65 <= charCode) & (charCode <= 90)) {
//			System.out.println("대문자이군요");
//		}
//		
//		if( (97 <= charCode) & (charCode <= 122)) {
//			System.out.println("소문자이군요");
//		}
//		
//		if( (48 <= charCode) & (charCode <= 57)) {
//			System.out.println("0 ~ 9 숫자이군요");
//		}
//		
//		int value = 6;
//
//		
//		if ( (value % 2 == 0) | (value % 3 == 0)) {
//			System.out.println("2또는 3의 배수군요");
//		}
//		
//		boolean result = (value % 2 ==0) || (value % 3 == 0);
//		if (!result) {
//			System.out.println("2 도는 3의 배수가 아니군요");
//		}

	}

}
