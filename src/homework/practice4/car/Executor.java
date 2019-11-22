package homework.practice4.car;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	public static void main(String[] args) {
		setAndPrintCarModel();
		setCarWheels();
		setCarEngine();
		setFuel();
	}

	private static void setCarEngine() {
		Car car = new Car();
		car.setCarEngine("Eletcric");
		System.out.println(car.getCarEngine());
	}

	private static void setCarWheels() {
		List<Car> car = new ArrayList<Car>();
		car.add(new Car(15));
		car.add(new Car(15));
		car.add(new Car(15));
		car.add(new Car(15));
		if (car.size() == 4) {
			move();
		} else {
			changeCarWheel();
		}
	}

	private static void setAndPrintCarModel() {
		Car car = new Car();
		car.setCarModel("Opel");
		System.out.println(car.getCarModel());
	}

	private static void changeCarWheel() {
		System.out.println("need to change the wheel");
	}

	private static void move() {
		System.out.println("car is mooving");
	}
	
	private static void setFuel() {
		Car car = new Car();
		car.setFuel(20);
		if (car.getFuel() == 0) {
			fillTheCar();
		}
	}
	
	private static void fillTheCar() {
		System.out.println("You need to fill the car");
	}

}
