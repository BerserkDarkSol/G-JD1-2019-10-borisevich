package homework.practice4.planet;

import java.util.List;

public class Planet {
	
	private String planetName;
	private List<Mainland> mainland;
	
	public Planet(List<Mainland> mainland) {
		this.setMainland(mainland);
	}


	public Planet() {		
	}
	
	public Planet(String string) {		
		
	}


	public void setOceansName(String oceanName) {
		Ocean ocean = new Ocean();
		ocean.setOceanName(oceanName);
		System.out.println(oceanName);
	}
	
	public void setIslandsQuantity(int islandsQuantity) {
		Island island = new Island();
		island.setIslandQuantity(islandsQuantity);
		System.out.println(islandsQuantity);
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}


	public List<Mainland> getMainland() {
		return mainland;
	}


	public void setMainland(List<Mainland> mainland) {
		this.mainland = mainland;
	}


}
