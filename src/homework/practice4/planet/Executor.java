package homework.practice4.planet;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		printPlanetName();
		printOceansNames();
		printMainlandsNames();
		printIslandsQuantity();
		printMainlandsNames();

	}

	public static void printPlanetName() {
		Planet planet = new Planet();
		planet.setPlanetName("Earth");
		System.out.println(planet.getPlanetName());
	}

	public static void printOceansNames() {
		Planet planet = new Planet();
		planet.setOceansName("Pacific Ocean");
		planet.setOceansName("Atlantic Ocean");
		planet.setOceansName("Indian Ocean");
		planet.setOceansName("Southern Ocean");
	}
	
	public static void printMainlandsNames() {
		List <Planet> planet = new ArrayList<Planet>();
		planet.add(new Planet("Africa"));
		planet.add(new Planet("Antarctica"));
		planet.add(new Planet("Eurasia"));
		planet.add(new Planet("South America"));
		planet.add(new Planet("North America"));
		planet.add(new Planet("Australia"));
		System.out.println("The number of mainlands is - " + planet.size());
	}
	
	public static void printIslandsQuantity() {
		Planet planet = new Planet();
		planet.setIslandsQuantity(500000);
	}

}
