package homework.practice4.country;

import java.util.List;

public class Country {

	private String capital;
	private List<Region> regions;

	public Country(String capital, List<Region> regions) {
		this.capital = capital;
		this.regions = regions;
	}

	public Country() {
	}

	public List<Region> getRegion() {
		return regions;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public void printTotalAreaRegion() {
		int totalCountyArea = 0;
		for (int i = 0; i < regions.size(); i++) {
			totalCountyArea += regions.get(i).getAreaOfEachRegion();
		}
		System.out.println("Total area of country region: " + totalCountyArea);
	}

	public void printCountyRegions() {
		System.out.println("Quantity of country region: " + regions.size());
	}

}
