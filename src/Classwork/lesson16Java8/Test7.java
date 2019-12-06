package classwork.lesson16Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Car {
	private int fuelVolume;

	public void addFuel(final int volume) {
		fuelVolume += volume;
	}

	@Override
	public String toString() {
		return "Car [fuelVolume=" + fuelVolume + "]";
	}
}

@FunctionalInterface
interface ConsumerWith2Params<T, O> {
	void accept(T t, O o);
}

public class Test7 {
	public static void main(String[] args) {
		final List<Car> cars = new ArrayList<>();
		cars.add(new Car());
		cars.add(new Car());

		System.out.println("initial cars state");
		Consumer<? super Car> objectPrinter = System.out::println;
		cars.forEach(objectPrinter);

		add30Liters(cars, Car::addFuel);

		System.out.println("cars after fuel append");

		cars.forEach(objectPrinter);
	}

	public static void add30Liters(List<Car> cars, ConsumerWith2Params<Car, Integer> consumer) {
		for (Car car : cars) {
			consumer.accept(car, 30);
		}
	}
}