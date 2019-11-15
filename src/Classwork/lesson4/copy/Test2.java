package classwork.lesson4.copy;

import classwork.lesson1.test;

public class Test2 {

	private static int staticField;
	private int nonStaticField;

	public static void main(String[] args) {

		doStatic();
//		doNonStatic();

		System.out.println(staticField);
//		System.out.println(nonStaticField);
		Test2.main(args);
		Test2 objectInstance = new Test2();
		System.out.println(objectInstance.nonStaticField);
		System.out.println(objectInstance.staticField);
		objectInstance.doStatic();
		objectInstance.doNonStatic();
	}

	private static void doStatic() {

	}

	private void doNonStatic() {

	}

}
