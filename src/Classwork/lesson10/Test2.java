package classwork.lesson10;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test2 {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat numFormat = NumberFormat.getNumberInstance(locale);
		Number num = numFormat.parse("10,5");
		System.out.println(num.doubleValue());
	}

}