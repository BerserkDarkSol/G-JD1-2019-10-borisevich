package classwork.lesson5.copy;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(date);
		long time = date.getTime();
		System.out.println(time);
		
		
		System.out.println(calendar);
		
		System.out.println(new Date(-1000000000));
// 		alt+shift+t		
//		Date date2 = new Date(-1000000000);
//		System.out.println(date2);
		
		System.out.println(date.getMonth()); // не юзать
		
	

	}

}
