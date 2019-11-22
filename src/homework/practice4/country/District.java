package homework.practice4.country;

import java.util.ArrayList;
import java.util.List;

public class District {

	private String district;

	private List<City> cities = new ArrayList<City>();

	public District(String district, List<City> cities) {
        this.district = district;
        this.cities = cities;
    }

	public void printCitiesInDistrict() {
		System.out.println(district);
	}

	public District(List<City> cities) {
		this.cities = cities;
	}

	public List<City> getCities() {
		return cities;
	}

	public void printDistrictcities() {
		System.out.println("Cities on Grodno district: ");
		List<City> GrodnoDistrictCities = new ArrayList<City>();
		GrodnoDistrictCities.add(new City("Grodno"));
		GrodnoDistrictCities.add(new City("Skidel"));
		GrodnoDistrictCities.add(new City("Sviatsk"));
		for (int i = 0; i < GrodnoDistrictCities.size(); i++) {
			GrodnoDistrictCities.get(i).printCity();
		}
		System.out.println("Cities on Brest district: ");
		List<City> BrestDistrictCities = new ArrayList<City>();
		BrestDistrictCities.add(new City("Brest"));
		BrestDistrictCities.add(new City("Skoki"));
		BrestDistrictCities.add(new City("Domachevo"));
		for (int i = 0; i < BrestDistrictCities.size(); i++) {
			BrestDistrictCities.get(i).printCity();
		}
		System.out.println("Cities on Brest district: ");
		List<City> MinskDistrictCities = new ArrayList<City>();
		MinskDistrictCities.add(new City("Minsk"));
		MinskDistrictCities.add(new City("Fanipol"));
		MinskDistrictCities.add(new City("Vitouka"));
		for (int i = 0; i < MinskDistrictCities.size(); i++) {
			MinskDistrictCities.get(i).printCity();
		}
	}
}
