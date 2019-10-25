package homework.practice1;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yourNumber = in.nextInt();
		System.out.println("You have entered the number - " + yourNumber);
		String printYourNumber = "The number you have entered is equal to ";
		switch (yourNumber) {
		case 1:
			System.out.println(printYourNumber + "January");
			break;
		case 2:
			System.out.println(printYourNumber + "February");
			break;
		case 3:
			System.out.println(printYourNumber + "Mart");
			break;
		case 4:
			System.out.println(printYourNumber + "April");
			break;
		case 5:
			System.out.println(printYourNumber + "May");
			break;
		case 6:
			System.out.println(printYourNumber + "June");
			break;
		case 7:
			System.out.println(printYourNumber + "Jule");
			break;
		case 8:
			System.out.println(printYourNumber + "August");
			break;
		case 9:
			System.out.println(printYourNumber + "September");
			break;
		case 10:
			System.out.println(printYourNumber + "October");
			break;
		case 11:
			System.out.println(printYourNumber + "November");
			break;
		case 12:
			System.out.println(printYourNumber + "December");
			break;
		default:
			System.out.println("You must entered the number from 1 to 12");
		}

	}

}
