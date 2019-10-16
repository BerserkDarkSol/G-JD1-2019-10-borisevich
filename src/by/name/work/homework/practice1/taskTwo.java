package by.name.work.homework.practice1;

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
		averageValue();

	}

	
	private static void printLine(String[] args) {
		System.out.println("_________________________________________________");
	}

	private static void printArray(int[] array) {
		System.out.println("Arrays value:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("The " + i + " element in array is " + array[i]);
		}
	}

	private static void shortestAndLongestNumber(int[] array) {
		System.out.println("The longest and the shortest numbers.");
		int max = String.valueOf(array[0]).length();

		for (int i = 0; i < array.length; i++) {
			if (max < String.valueOf(array[i]).length()) {
				max = String.valueOf(array[i]).length();
			}
		}
		int maxValue = array[0];
		int maxLengthVal = array[0];
		for (int i = 0; i < array.length; i++) {
			if (maxValue < array[i]) {
				maxLengthVal = maxValue;
				maxValue = array[i];
			}
		}
		System.out.println("The length of the longest number is: " + max + " its value is " + maxValue
				+ " the first entered number is: " + maxLengthVal);
		int min = String.valueOf(array[0]).length();

		for (int i = 0; i < array.length; i++) {
			if (min > String.valueOf(array[i]).length()) {

				min = String.valueOf(array[i]).length();

			}
		}
		int minValue = array[0];
		int minLengthVal = array[0];
		for (int i = 0; i < array.length; i++) {
			if (minValue > array[i]) {
				minLengthVal = minValue;
				minValue = array[i];
			}
		}

		System.out.println("The length of the shortest number is: " + min + " its value is " + minValue
				+ " the first entered number is: " + minLengthVal);
	}
	
	private static void averageValue() {
		
		
		
	}


}
