package homework.practice1;

import java.util.Scanner;

public class taskTwo {

	public static void main(String[] args) {
		System.out.println("enter the number of elements in the array");

		Scanner in = new Scanner(System.in);
		Scanner inArray = new Scanner(System.in);
		int yourNumber = in.nextInt();

		System.out.println("You entered the number: " + yourNumber);

		int[] array = new int[yourNumber];
		for (int i = 0; i < array.length; i++) {
			array[i] = inArray.nextInt();
		}
		printLine(args);
		printArray(array);
		printLine(args);
		shortestAndLongestNumber(array);
		printLine(args);

	}

	private static void printLine(String[] args) {
		System.out.println("_________________________________________________");
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("The " + i + " element in array is " + array[i]);
		}
	}

	private static void shortestAndLongestNumber(int[] array) {

//		int length = String.valueOf(array[0]).length();
		// System.out.println(length);
		int max = String.valueOf(array[0]).length();
		for (int i = 0; i < array.length; i++) {
			if (max < String.valueOf(array[i]).length()) {
				max = String.valueOf(array[i]).length();
			}
		}
		System.out.println("Maximum value:" + max);
		int min = String.valueOf(array[0]).length();
		for (int i = 0; i < array.length; i++) {
			if (min > String.valueOf(array[i]).length()) {
				min = String.valueOf(array[i]).length();
			}
		}
		System.out.println("Minimum value:" + min);
	}

}
