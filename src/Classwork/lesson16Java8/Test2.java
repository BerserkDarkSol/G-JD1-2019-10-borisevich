package classwork.lesson16Java8;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
			
		Arrays.asList("a", "b", "c").sort((e1, e2) -> e1.compareTo(e2));

		Arrays.asList("a", "b", "c").sort((e1, e2) -> {
			int result = e1.compareTo(e2);
			return result;
		});

		final int multiplier = 4;
		Arrays.asList(1, 2, 3, 4, 5).forEach(e -> System.out.println(e * multiplier));

	}

}
