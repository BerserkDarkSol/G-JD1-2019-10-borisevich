package homework.practice2;

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
		isPalindrome(123321);
	}

	public static void isPalindrome(int integer) {
		int palindrome = integer;
		int a = palindrome;
		int reverse = 0;

		// Compute the reverse
		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		// The integer is palindrome if integer and reverse are equal
		if (a == reverse) {
			System.out.println("sdfdsf"); // Improved by Peter Lawrey

		} else {
			System.out.println(a + " " + reverse);
		}

	}

}
