package classwork.lesson3;

import java.util.Random;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		System.out.println("initial arrray:");
		printArray(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {

			array[i] += 10;
		}
		System.out.println("new array:");
		printArray(array);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
