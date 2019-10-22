package homework.practice2;

public class task {

	public static void main(String[] args) {
		int array[][] = { { 1, -2, 3 }, { 4, -5, 6 } };

		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			boolean started = false;
			for (int j = 0; j < array[i].length; j++) {
				if (!started && array[i][j] > 0) {
					started = true;
					continue;
				}
				if (started && array[i][j] > 0) {
					started = false;
					break;
				}
				if (started) {
					sum += array[i][j];
				}

			}
			if (started) {
				sum = 0;
			}
			System.out.println(sum);
		}
	}

}
