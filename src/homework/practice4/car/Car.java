package homework.practice4.car;

public class Car {

	private String carModel;
	private String carEngine;
	private int carWheel;

	public void printEngineType() {
		System.out.println("Car engine type is - " + carEngine);
	}

	public void printWheelQuantity() {
		System.out.println("Car wheel quantity is - " + carWheel);
	}

	public void printCarModel() {
		System.out.println("Car model is - " + carModel);
	}

	public int getCarWheel() {
		return carWheel;
	}

	public void setCarWheel(int carWheel) {
		this.carWheel = carWheel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarEngine() {
		return carEngine;
	}

	public String setCarEngine(String carEngine) {
		this.carEngine = carEngine;
		return carEngine;
	}

}
