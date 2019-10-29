package classwork.lesson8.annotation2;

public class Class2 {
	public void test1() {
		System.out.printf("%s.test1()\n", getClass().getSimpleName());
	}

	public void test2() {
		System.out.printf("%s.test2()\n", getClass().getSimpleName());
	}

	@ClassAnnotation
	public void test3() {
		System.out.printf("%s.test3()\n", getClass().getSimpleName());
	}
}
