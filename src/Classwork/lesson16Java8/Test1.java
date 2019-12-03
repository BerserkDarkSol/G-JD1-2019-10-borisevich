package classwork.lesson16Java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {

//		Arrays.asList("a", "b", "c").forEach(new Consumer<String>() {
//			@Override
//			public void accept(String e) {
//				System.out.println(e);
//				System.out.println(e);
//			}
//		});
//		
		Arrays.asList("a", "b", "c").forEach(e -> {
			System.out.println(e);
			System.out.println(e);
		});

	}

}
