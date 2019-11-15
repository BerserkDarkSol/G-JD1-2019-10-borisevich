package classwork.lesson5.copy2;

public class Test3 {

	public static void main(String[] args) {

		String str = "Test    string for split";
		String[] words = str.split(" "); // + это регул€рка
		for (String word : words) {
			System.out.print(word + " ");
		}

	}

}
