package classwork.lesson16Java8;

import java.util.ArrayList;
import java.util.List;

class Car3 {
	public void follow(final Car3 another) {
		System.out.println("Followwing the " + another.toString());
	}
}

public class Test6 {
	public static void main(String[] args) {
		final List<Car3> cars = new ArrayList<>();
		final Car3 police = new Car3();
		cars.forEach(police::follow);
	}

}