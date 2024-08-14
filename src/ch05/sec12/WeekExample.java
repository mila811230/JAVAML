package ch05.sec12;

import java.util.Calendar;

enum Day{Mon, Tue, Wed, Thu, Fri, Sat, Sun}
enum TracfficLight{
	RED, YELLOW, GREEN
}
public class WeekExample {

	public static void main(String[] args) {
		
		TracfficLight light = TracfficLight.RED;
		switch (light) {
		case RED : 
			System.out.println("멈춰");
			break;
		case YELLOW : 
			System.out.println("기다려");
			break;
		case GREEN : 
			System.out.println("레츠고");
			break;
		}
		
		
		
		Day today = null;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 15);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//1:일요일, 2:월요일 ~7:토요일
		switch(week) {
		case 1 : 
			today = Day.Sun;
			break;
		case 2 : 
			today = Day.Tue;
			break;
		case 3 : 
			today = Day.Wed;
			break;
		case 4 : 
			today = Day.Thu;
			break;
		case 5 : 
			today = Day.Fri;
			break;
		case 6 : 
			today = Day.Sat;
			break;
		case 7 : 
			today = Day.Sun;
			break;
		}
		
		
		
		System.out.println("오늘은 " + today + " 입니다");
		
		switch (today) {
		case Mon : 
			System.out.println("월요일은 원래 마시는 날");
			break;
		case Tue : 
			System.out.println("화요일은 호로로록 마시는 날");
			break;
		case Wed : 
			System.out.println("수용일은 물대신 마시는 날");
			break;
		case Thu : 
			System.out.println("목요일은 목말라 마시는 날");
			break;
		case Fri : 
			System.out.println("금요일은 신나서 마시는 날");
			break;
		case Sat : 
			System.out.println("토요일은 토하면서 마시는 날");
			break;
		case Sun : 
			System.out.println("일요일은 짜파게티 먹는 날");
			break;
			
		}

	}

}
