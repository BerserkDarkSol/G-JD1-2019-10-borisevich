package classwork.lesson2.copy2;

public class Test6 {

	private static class Car {
		private int year;
		public Car(int year) {
			this.year = year;
		}
		public int getYear() {
			return year;
		}
	}

	public static void main(String[] args) {
		Car car = new Car(2010);
		Car similarCar = new Car(2010);
		System.out.println(car == similarCar);
	}

}
