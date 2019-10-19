package Classwork.lesson5;

public class RefactorTextReplace {

	public static void main(String[] args) {

		String str = "Test      multiple    spaces";
		System.out.println(str.replaceAll(" +", " "));

	}

}
