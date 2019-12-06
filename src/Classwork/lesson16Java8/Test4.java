package classwork.lesson16Java8;

import java.util.function.Supplier;

class Car4 {
	public static Car4 create(final Supplier<Car4> supplier) {
		return supplier.get();
	}

}

public class Test4 {

	public static void main(String[] args) {
		Supplier<Car4> supplier = Car4::new;
		final Car4 car = Car4.create(supplier);
	}

}