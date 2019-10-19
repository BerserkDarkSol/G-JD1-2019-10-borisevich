package homework.practice1;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		System.out.println("You entered string " + s);

//		int array[] = {1, 2, 3};
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(i);
//			for (int b = array[i]; b == 0; b = b / 10) {
//				System.out.println("b = " + b % 10);
//			}
//		}

//		int a = 14;
//		int b = 3;
//		int c = a % b;
//		System.out.println(c);
//		
//		newArray();
		int Ar[] = { 1, 2 };
		// int[] Ar1 = {2, 3};
		int[] copyAr = copyArray(Ar);

		toDo(copyAr);
		// int[] copyAr1 = copyArray(Ar);

	}

	private static int[] copyArray(int[] Sergei) {
		int[] copiedArray = new int[Sergei.length];
		for (int i = 0; i < Sergei.length; i++) {
			copiedArray[i] = Sergei[i];
		}
		return copiedArray;
	}

	private static void toDo(int[] inputArray) {
		int[] resultArray = copyArray(inputArray);

	}

}
