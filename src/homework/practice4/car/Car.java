package homework.practice4.car;

import java.util.List;

public class Car {

	private String carModel;
	private String carEngine;
	private int fuel;

	private List<Wheel> wheel;
	
	public String getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}

	private int carWheelSize;

	public Car(int i) {
	}

	public Car() {
	}

	public void setCarWheel() {
		Wheel wheel = new Wheel();
		wheel.setSize(carWheelSize);
	}

	public void setCarEngineType() {
		Engine engine = new Engine();
		engine.setEngineType(carEngine);
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public List<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(List<Wheel> wheel) {
		this.wheel = wheel;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

}
