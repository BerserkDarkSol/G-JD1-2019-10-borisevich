package classwork.lesson1;

import java.util.List;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println("free memory: " + Runtime.getRuntime().freeMemory());
		for (int i = 0; i < 15_000_000; i++) {
			list.add(new Man(i));
		}

		System.out.println("free memory: " + Runtime.getRuntime().freeMemory());

	}

}
