package classwork.lesson10.copy2;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Test3 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String format = df.format(currentDate);
		System.out.println(format);

		Date praseDate = df.parse("10,12,2010");
		System.out.println(praseDate);
	}
}