package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		
		case Calendar.MONDAY : 
			strWeek = "월";
			break;
		case Calendar.TUESDAY : 
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY : 
			strWeek = "수";
			break;
		case Calendar.THURSDAY : 
			strWeek = "목";
			break;
		case Calendar.FRIDAY : 
			strWeek = "금";
			break;
		case Calendar.SATURDAY : 
			strWeek = "토";
			break;
		case Calendar.SUNDAY : 
			strWeek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
			
		} else {
			strAmPm = "오후";
			
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf(" %d년 %d월 %d일 \n %s요일 %s \n %d시 %d분 %d초 \n",
				year, month, day, strWeek, strAmPm, hour, minute, second);

	}

}




















