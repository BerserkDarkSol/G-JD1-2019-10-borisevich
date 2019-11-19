package classwork.lesson12.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CarSerialization implements Serializable {

	static String vin;
	private static Model model;
	private static Brand brand;
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("car.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Car car = new Car();
		car.setModel(model);
		car.setVin(vin);
		car.setBrand(brand);

		oos.writeObject(car);
		oos.close();
	}

}
