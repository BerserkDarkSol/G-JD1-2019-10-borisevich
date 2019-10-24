package homework.practice2;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner inArray = new Scanner(System.in);

		System.out.println("Enter the sides of your matrix number");
		int size = in.nextInt();
		System.out.println("Enter the maximum random number to fill your matrix");
		int randomNumber = in.nextInt();

		double[][] array = new double[size][size];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = ((Math.random() * (randomNumber * 2)) - randomNumber);
			}
		}

		for (double[] anArr : array) {
			for (double anAnArr : anArr) {
				System.out.print(anAnArr + " ");
			}
			System.out.println();
		}
		System.out.println();

		roundingNumbersInArray(array);
		foundingAndDeletingMaxValueInArray(array, size);
		foundingAndDeletingZeroColAndRowInArray(array, size);
		sortingByRandomColumn(array, size);
		subtractingRowAvarageFromEachElement(array, size);
		foundingSumBetweenFirstAndSecondPositiveRowNumbers(array, size);
		transposeMatrix(array, size);

	}

	private static void roundingNumbersInArray(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = Math.round(array[i][j]);
			}
		}
		for (double[] anArr : array) {
			for (double anAnArr : anArr) {
				System.out.print(anAnArr + " ");
			}
			System.out.println();
		}

	}

	private static void foundingAndDeletingMaxValueInArray(double[][] array, int size) {

		// Finding the max number in source matrix
		double maxNumber = array[0][0];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] >= maxNumber) {
					maxNumber = array[i][j];
				}
			}
		}

		System.out.println();
		System.out.println("Max number: " + maxNumber);
		// Founding indexes of the rows and columns without zero number, and sizes for
		// new matrix
		boolean[] columnsForRemove = new boolean[size];
		boolean[] rowsForRemove = new boolean[size];
		int columnsForRemoveSize = 0;
		int rowsForRemoveSize = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] == maxNumber) {
					if (!rowsForRemove[i]) {
						rowsForRemove[i] = true;
						rowsForRemoveSize++;
					}
					if (!columnsForRemove[j]) {
						columnsForRemove[j] = true;
						columnsForRemoveSize++;
					}
				}
			}
		}

		// Creating a new matrix
		double[][] newMatrix = new double[size - rowsForRemoveSize + 1][size - columnsForRemoveSize + 1];
		int rowPosition = 0;
		for (int i = 0; i < size; i++) {
			if (rowsForRemove[i]) {
				continue;
			}

			int colPosition = 0;
			for (int j = 0; j < size; j++) {
				if (!columnsForRemove[j]) {
					newMatrix[rowPosition][colPosition++] = (int) array[i][j];
				}
			}

			rowPosition++;
		}

		// Displaying result matrix
		System.out.println();
		System.out.println("New matrix without column and rows with max number: ");
		for (int i = 0; i < size - rowsForRemoveSize; i++) {
			for (int j = 0; j < size - columnsForRemoveSize; j++) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void foundingAndDeletingZeroColAndRowInArray(double[][] array, int size) {

		// Founding indexes of the rows and columns without zero number, and sizes for
		// new matrix
		boolean[] columnsForRemove = new boolean[size];
		boolean[] rowsForRemove = new boolean[size];
		int columnsForRemoveSize = 0;
		int rowsForRemoveSize = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] == 0) {
					if (!rowsForRemove[i]) {
						rowsForRemove[i] = true;
						rowsForRemoveSize++;
					}
					if (!columnsForRemove[j]) {
						columnsForRemove[j] = true;
						columnsForRemoveSize++;
					}
				}
			}
		}

		// Creating a new matrix
		double[][] newMatrix = new double[size - rowsForRemoveSize + 1][size - columnsForRemoveSize + 1];
		int rowPosition = 0;
		for (int i = 0; i < size; i++) {
			if (rowsForRemove[i]) {
				continue;
			}
			int colPosition = 0;
			for (int j = 0; j < size; j++) {
				if (!columnsForRemove[j]) {
					newMatrix[rowPosition][colPosition++] = (int) array[i][j];
				}
			}
			rowPosition++;
		}

		// Displaying result matrix
		System.out.println();
		System.out.println("New matrix without column and rows with zero numbers: ");
		for (int i = 0; i < size - rowsForRemoveSize; i++) {
			for (int j = 0; j < size - columnsForRemoveSize; j++) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void sortingByRandomColumn(double[][] array, int size) {
		System.out.println("New matrix with sorting by random column: ");
		int randomColumnSorting = (int) ((Math.random() * size));
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i][randomColumnSorting] < array[j][randomColumnSorting]) {
					for (int k = 0; k < size; k++) {
						int temp = (int) array[i][k];
						array[i][k] = array[j][k];
						array[j][k] = temp;
					}
				}
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void subtractingRowAvarageFromEachElement(double[][] array, int size) {

		int arrrayOfAvarage[] = new int[size];
		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = 0; j < size; j++) {
				sum += (int) array[i][j];
			}
			arrrayOfAvarage[i] = sum / size;
		}
		System.out.println();
		int avarageForEachRow = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = array[i][j] - arrrayOfAvarage[avarageForEachRow];
			}
			avarageForEachRow++;
		}
		System.out.println("The matrix with subtracting avarage number in each row: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void foundingSumBetweenFirstAndSecondPositiveRowNumbers(double[][] array, int size) {

		for (int i = 0; i < size; i++) {
			int sum = 0;
			boolean startedCountingPositive = false;
			for (int j = 0; j < size; j++) {
				if (!startedCountingPositive && array[i][j] > 0) {
					startedCountingPositive = true;
					continue;
				}
				if (startedCountingPositive && array[i][j] > 0) {
					startedCountingPositive = false;
					break;
				}
				if (startedCountingPositive) {
					sum += array[i][j];
				}

			}
			if (startedCountingPositive) {
				sum = 0;
			}
			System.out.println("The amount of elements between first and second positive row numbers " + sum);
		}
		System.out.println();
	}

	private static void transposeMatrix(double[][] array, int size) {

		double[][] copyArray = array;
		double[][] transposedMatrix = new double[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				transposedMatrix[j][i] = copyArray[i][j];
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(transposedMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
