package classwork.lesson5.copy2;

import java.util.Calendar;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {

		Date date1 = new Date();
		System.out.printf("current date1:%s\n", date1);

		Calendar calendar = Calendar.getInstance();
		System.out.printf("current date2:%s\n", calendar.getTime().getTime());

		calendar.setTime(date1);
		System.out.printf("current date2 after setting date1:%s\n", calendar.getTime().getTime());

		calendar.add(Calendar.DAY_OF_YEAR, -3);
		calendar.add(Calendar.SECOND, -4);

		System.out.printf("current date2 after shifting:%s\n", calendar.getTime());

	}

}
