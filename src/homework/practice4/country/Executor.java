package homework.practice4.country;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		List<City> city = new ArrayList<City>();
		city.add(new City("sdfdsf"));
		
		for (int i = 0; i < city.size(); i++) {
			System.out.println(city.get(i));
		}
		
		String a = "asdf ";

		Country country = new Country();
		//country.printCapital();

	}

}
