package classwork.lesson10.copy;

import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {

		Locale locale = new Locale("en", "GB");
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rubFormat.format(10000));

	}

}
