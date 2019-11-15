package classwork.lesson5.copy2;

public class Test1 {

	public static void main(String[] args) {

		String lang = "java";
		String user = "Dmitry";
//		variant 1
		String result = String.format("%s is learning %s", user, lang);
		System.out.println(result);
//  	variant 2
		System.out.printf("%s is learning %s\n", user, lang);
	}

}
