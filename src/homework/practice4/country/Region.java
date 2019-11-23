package homework.practice4.country;

import java.util.List;

public class Region {

	private String region;
	private int areaOfEachRegion;
	private List<District> districts;
	
	public Region(String string, int i, List<District> districts) {
		this.region = string;
		this.areaOfEachRegion = i;
		this.districts = districts;
	}


	public Region(String string) {
		this.region = string;
	}

	public Region(List<District> districts) {
		this.districts = districts;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void printDistrictQuantity() {
		for (int i = 0; i < districts.size(); i++) {
			districts.get(i).printCitiesInDistrict();
		}
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void printRegion() {
		System.out.println(region);
	}

	public int getAreaOfEachRegion() {
		return areaOfEachRegion;
	}

	public void setAreaOfEachRegion(int areaOfEachRegion) {
		this.areaOfEachRegion = areaOfEachRegion;
	}

}
