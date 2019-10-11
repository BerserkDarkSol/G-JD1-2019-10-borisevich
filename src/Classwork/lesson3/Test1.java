package Classwork.lesson3;

public class Test1 {

	public static void main(String[] args) {

		if (printAndReturnFalse() || printAndReturnTrue()) {
			System.out.println("result: TRUE");
		} else {
			System.out.println("result: FALSE");
		}
		

	}

	private static boolean printAndReturnTrue() {
		System.out.println("TRUE");
		return true;
	}

	private static boolean printAndReturnFalse() {
		System.out.println("FALSE");
		return false;
	}

}
