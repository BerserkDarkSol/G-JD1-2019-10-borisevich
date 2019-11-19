package homework.practice4.car;

public class Executor {

	public static void main(String[] args) {

		Engine engine = new Engine();
		engine.setCarEngine("eletcric");

		Wheel wheel = new Wheel();
		wheel.setCarWheel(4);

		Car car = new Car();
		car.setCarModel("opel");

		car.printEngineType();
		car.printWheelQuantity();
		car.printCarModel();
		changeCarWheel();
		move();

	}

	private static void changeCarWheel() {
		Car car = new Car();
		if (car.getCarWheel() != 4) {
			System.out.println("need to change the wheel");
		}
	}

	private static void move() {
		Car car = new Car();
		boolean carHasEngine = car.getCarEngine().equals(null);
		if (car.getCarWheel() == 4 && !carHasEngine) {
			System.out.println("car is mooving");
		}

	}

}
