package classwork.lesson9.list;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {

		Set<String> words = new HashSet<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");
		words.add("Four");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
