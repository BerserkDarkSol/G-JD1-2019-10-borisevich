package classwork.lesson10.localization;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();

		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayName());

	}

}
