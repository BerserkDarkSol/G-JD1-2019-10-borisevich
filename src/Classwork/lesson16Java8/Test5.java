package classwork.lesson16Java8;

import java.util.ArrayList;
import java.util.List;

class NewCar {
	public static void destroy(final Car car) {
		System.out.println("Destroyed " + car.toString());
	}

}

public class Test5 {

	public static void main(String[] args) {
		final List<Car> cars = new ArrayList<>();
		cars.forEach(NewCar::destroy);

	}

}