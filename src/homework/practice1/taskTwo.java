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

		copyArray(array);
		int[] copyAr = copyArray(array);
		printLine(args);
		printArray(array);
		printLine(args);
		shortestAndLongestNumber(array);
		printLine(args);
		averageValue(array);
		printLine(args);
		evenNumber(array);
		printLine(args);
		threeAndFiveNumbers(array);
		printLine(args);
		primeNumbers(array);
		printLine(args);
		digitsIncreases(array);
		printLine(args);

	}

	private static int[] copyArray(int[] copyArray) {
		int[] copiedArray = new int[copyArray.length];
		for (int i = 0; i < copyArray.length; i++) {
			copiedArray[i] = copyArray[i];
		}
		return copiedArray;
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

	private static void averageValue(int[] array) {
		int sumLenght = 0;

		for (int i = 0; i < array.length; i++) {
			sumLenght += String.valueOf(array[i]).length();
		}
		float arrayLenght = (array.length);
		float arrayAvarage = (sumLenght / arrayLenght);
		System.out.println("Avarage in array is - " + arrayAvarage);
		for (int i = 0; i < array.length; i++) {
			if (String.valueOf(array[i]).length() > arrayAvarage) {

				System.out.println("Number more then avarage - " + array[i] + " It's lenght is - "
						+ String.valueOf(array[i]).length());
			} else if (String.valueOf(array[i]).length() < arrayAvarage) {

				System.out.println("Number less then avarage - " + array[i] + " It's lenght is - "
						+ String.valueOf(array[i]).length());
			}
		}
	}

	private static void evenNumber(int[] array) {
		boolean nothingFound = true;
		int qualityOfNumbers = 0;
		for (int i = 0; i < array.length; i++) {
			int digitCheck = 0;
			int localArray = array[i];
			while (localArray != 0) {

				int evenDigit = (localArray % 10) % 2;
				if (evenDigit != 0) {
					digitCheck++;
					break;
				}
				localArray = localArray / 10;
			}
			if (digitCheck == 0) {
				qualityOfNumbers++;
				nothingFound = false;
			}
		}

		if (nothingFound) {
			System.out.println("There isn't any number with all even digits");
		} else {
			System.out.println("The quality of the numbers with all even digits - " + " " + qualityOfNumbers);
		}
	}

	private static void threeAndFiveNumbers(int[] array) {

		int[] localArray = copyArray(array);
		int countOfNonMatchingNumber = 0;
		for (int i = 0; i < localArray.length; i++) {

			if ((array[i] % 3) == 0 || (array[i] % 5) == 0) {
				System.out.println("The numbers that divided by 3 or 5 are: " + array[i]);
			} else {
				countOfNonMatchingNumber++;

			}

		}
		if (countOfNonMatchingNumber == localArray.length) {
			System.out.println("There aren't any numbers that divided by 3 or 5");
		}
	}


	private static void primeNumbers(int[] simpleNumbersarray) {

		int[] localArray = copyArray(simpleNumbersarray);
		for (int i = 0; i < localArray.length; i++) {
			for (int checkPrimeNumber = 2; checkPrimeNumber <= localArray[i]; checkPrimeNumber++) {
				if ((localArray[i] > checkPrimeNumber) && (localArray[i] % checkPrimeNumber) == 0) {
					break;
				} else if ((localArray[i] == checkPrimeNumber) && (localArray[i] % checkPrimeNumber) == 0) {
					System.out.println("The prime numbers is: " + localArray[i]);
				}
			}

		}
	}

	private static void digitsIncreases(int[] digitsIncreasesArray) {
		int checkFordigitsIncreasesNumbers = 0;
		int[] localArray = copyArray(digitsIncreasesArray);
		for (int i = 0; i < localArray.length; i++) {
			if ((localArray[i] % 10) > (localArray[i] / 10) % 10) {
				localArray[i] = localArray[i] / 10;
			} else {
				checkFordigitsIncreasesNumbers++;
				break;
			}
		}
	}

}
