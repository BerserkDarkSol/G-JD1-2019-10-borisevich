package homework.practice4.country;

import java.util.ArrayList;
import java.util.List;


public class Executor {

	public static void main(String[] args) {

		Country country = createData();
		
		printCapital();
		country.printCountyRegions();
		country.printTotalAreaRegion();
		printRegionCenters();
		
	}

	private static Country createData() {
		List<City> grodnoDistsCities = new ArrayList<City>();
		List<City> minskDistsCities = new ArrayList<City>();
		List<City> brestDistsCities = new ArrayList<City>();
		grodnoDistsCities.add(new City("Grodno"));
		grodnoDistsCities.add(new City("Skidel"));
		grodnoDistsCities.add(new City("Sviatsk"));
		minskDistsCities.add(new City("Minsk"));
		minskDistsCities.add(new City("Fanipol"));
		minskDistsCities.add(new City("Vitouka"));
		brestDistsCities.add(new City("Brest"));
		brestDistsCities.add(new City("Skoki"));
		brestDistsCities.add(new City("Domachevo"));
		List<District> distsMinsk = new ArrayList<District>();
		List<District> distsGrodno = new ArrayList<District>();
		List<District> distsBrest = new ArrayList<District>();
		distsGrodno.add(new District("Grodno district", grodnoDistsCities));
		distsMinsk.add(new District("Minsk district", minskDistsCities));
		distsBrest.add(new District("Brest district", brestDistsCities));
		List<Region> regionCities = new ArrayList<Region>();
		regionCities.add(new Region("Minsk", 1000, distsMinsk));
		regionCities.add(new Region("Grodno", 500, distsGrodno));
		regionCities.add(new Region("Brest", 700, distsBrest));
		Country country = new Country("Minsk", regionCities);
		country.setCapital("Minsk");
		return country;
	}

	public static void printCapital() {
		Country capital = new Country();
		capital.setCapital("Minsk");
		System.out.println("The capital of country is - " + capital.getCapital());
	}

	public static void printRegionCenters() {
		List<Region> regionCities = new ArrayList<Region>();
		regionCities.add(new Region("Minsk"));
		regionCities.add(new Region("Grodno"));
		regionCities.add(new Region("Brest"));
		System.out.println("The region centers  cities are: ");
		for (int i = 0; i < regionCities.size(); i++) {
			regionCities.get(i).printRegion();;
		}
	}

	public static void getRegionQuantity() {
		List<Region> region = new ArrayList<Region>();
		System.out.println(region.size());
	}

}
