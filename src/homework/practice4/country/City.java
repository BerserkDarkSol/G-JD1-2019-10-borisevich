package homework.practice4.country;

public class City {

	private String city;
	private String capital;

	public City(String city) {
		this.city = city;
	}

	public City() {
	}
	
	public void printCity() {
		System.out.println(city);
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}
