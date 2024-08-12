package ch05.sec06;

public class Length2Example2 {

	public static void main(String[] args) {
		String date1 = "2024년08월12일 18:45:23";
		String date2 = "2024-08-12 pm 11:25:03";
		String date3 = "24/08/12 am 06:25:13";
	
		
		// 8/12 오후 9시까지 몇시 몇분이 남았는지 구하시오
		// 8/12일 오후 9시 정각까지 XX시 XX분 XX초가 남았습니다. 
		
		//기준시간
		int stdHour = 20;
		int stdMinute = 59;
		int stdSec = 60;
		
		String strDate = date1;
		int hour = 0;
		int minute = 0;
		int sec = 0;
		if (strDate.contains("pm")) {
			hour +=12;
		}
		
		int hourIndex = strDate.indexOf(":") - 2;
		String strHour = strDate.substring(hourIndex, hourIndex + 2);
		hour += Integer.parseInt(strHour);
		System.out.println(hour);
		
		String strMinute = strDate.substring(hourIndex + 3, hourIndex + 5);
		minute += Integer.parseInt(strMinute);
		System.out.println(minute);
		
		String strSec = strDate.substring(hourIndex + 6, hourIndex + 8);
		minute += Integer.parseInt(strSec);
		System.out.println(sec);
		System.out.printf("8/12일 오후 9시 정각까지 %2d시 %2d분 %2d초가 남았습니다.(%02d : %02d : %02d)",
				stdHour-hour, stdMinute-minute, stdSec-sec, hour, minute, sec);
		

	}

}
