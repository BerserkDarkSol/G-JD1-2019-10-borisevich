package homework.practice5;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	public static void main(String[] args) {

		List<Ocean> oceans = new ArrayList<Ocean>();
		oceans.add(new Ocean("slkdfha"));

		for (int i = 0; i < oceans.size(); i++) {
			oceans.get(i).printOceanName();
		}


	}

}
