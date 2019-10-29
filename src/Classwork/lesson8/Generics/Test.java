package classwork.lesson8.Generics;

public class Test {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		String testItem = "Test";
		box.setItem(testItem);

		Object item = box.getItem();
		Integer itemInt = (Integer) item;
				
	}
}
