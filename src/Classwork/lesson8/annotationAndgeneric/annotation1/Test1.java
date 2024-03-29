package classwork.lesson8.annotationAndgeneric.annotation1;

public class Test1 {

	public static void main(String[] args) {

		printClassVersion(new Class1());
		printClassVersion(new Class2());
		printClassVersion(new Class2());
		printClassVersion(new Class2());

	}

	private static void printClassVersion(Object o) {
		Class<? extends Object> clazz = o.getClass();
		Version annotation = clazz.getAnnotation(Version.class);

		System.out.println("version of object: " + annotation.versionNumber());

	}

}
