package ch05.sec12;

import java.util.Calendar;

public class Week2Example {

	public static void main(String[] args) {
		
		//week 열거 타입 변수 선언
		Week today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
		case 1 : today = Week.Sunday;
		break;
		case 2 : today = Week.Monday;
		break;
		case 3 : today = Week.Tuesday;
		break;
		case 4 : today = Week.Wednesday;
		break;
		case 5 : today = Week.Thursday;
		break;
		case 6 : today = Week.Friday;
		break;
		case 7 : today = Week.Saturday;
		break;
			
		}
		
		//열거 타입 변수를 사용
		if (today ==Week.Tuesday) {
			System.out.println("일요일에는 짜파게티를 먹어야죵");
		} else {
			System.out.println("팥빙수도 먹자요");
			
		}

	}

}
