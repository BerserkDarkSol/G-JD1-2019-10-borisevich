package classwork.lesson9.copy2;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		Map<Integer, String> words = new HashMap<Integer, String>();
		words.put(1, "first");
		words.put(2, "two");
		words.put(3, "three");
		System.out.println("Map: " + words);
		System.out.println("Word us " + words.get(3));
		
		System.out.println(new Boolean(true).hashCode());

	}

}
