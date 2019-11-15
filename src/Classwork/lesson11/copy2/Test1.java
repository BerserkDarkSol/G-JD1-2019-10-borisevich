package classwork.lesson11.copy2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main:start");
		method1();
		System.out.println("main:end");
	}

	private static void method1() {
		System.out.println("method1:start");
		try {
			method2();
			System.out.println("method1:start after method2");
		} catch (MyException2 e) {
			System.out.println("method1:inside catch");
			e.printStackTrace();
			throw new RuntimeException();
		} catch (MyException3 e) {
			System.out.println("method1:inside catch");
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			System.out.println("method1:finally");
		}
		System.out.println("method1:end");
	}

	private static void method2() throws MyException3, MyException2 {
		System.out.println("method2:start");

		if (true) {
			throw new MyException3();

			// throw new RuntimeException("throw my detail exception"); // checked
		}

		if (true) {
			throw new MyException2();
		}

		System.out.println("method2:end");
	}
}