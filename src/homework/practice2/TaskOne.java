package homework.practice2;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner inArray = new Scanner(System.in);

		System.out.println("Enter the sides of your array number");
		int yourNumber = in.nextInt();
		System.out.println("Enter the maximum random number to fill your adday");
		int randomNumber = in.nextInt();

		int[][] array = new int[yourNumber][yourNumber];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = rand.nextInt(randomNumber);
			}
		}

		for (int[] anArr : array) {
			for (int anAnArr : anArr) {
				System.out.print(anAnArr + " ");
			}
			System.out.println();
		}
	}

}
