package classwork.lesson5.copy;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RefactorTextMatch {

	public static void main(String[] args) {

		Pattern p = Pattern.compile(" +- +");

		Matcher matcher = p.matcher("Test - string - test");

		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.end());
		}

	}

}
