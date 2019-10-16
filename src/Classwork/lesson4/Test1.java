package Classwork.lesson4;

public class Test1 {

	public static void main(String[] args) {

		test1();
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
		test3();
	}

	private static void test3() {
		System.out.println("I'm in hte top of the stack now");
		System.out.println("");
	}

}
