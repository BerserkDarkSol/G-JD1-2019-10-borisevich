package classwork.lesson16Java8;

import java.util.function.Consumer;

public class Test3 {

	public static void main(String[] args) {

		Consumer<String> printFucntion = System.out::print;

		printFucntion.accept("Hello world");
	}

}
