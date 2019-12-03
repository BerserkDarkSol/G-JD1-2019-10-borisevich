package classwork.lesson16Java8;

public interface Rectangle {
	static int squareStatic(int a, int b) {
		return a * b;

	}

	default int squareDefault(int a, int b) {
		return a * b;
	}

}
