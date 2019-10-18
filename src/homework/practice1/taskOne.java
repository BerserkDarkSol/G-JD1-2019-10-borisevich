package homework.practice1;
import java.util.Scanner;

public class taskOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yourNumber = in.nextInt();
		System.out.println("You entered the " + yourNumber + " number:");
		switch (yourNumber) {
		case 1:
			System.out.println("The number you have entered is equal to January");
			break;
		case 2:
			System.out.println("The number you have entered is equal to February");
			break;
		case 3:
			System.out.println("The number you have entered is equal to Mart");
			break;
		case 4:
			System.out.println("The number you have entered is equal to April");
			break;
		case 5:
			System.out.println("The number you have entered is equal to May");
			break;
		case 6:
			System.out.println("The number you have entered is equal to June");
			break;
		case 7:
			System.out.println("The number you have entered is equal to Jule");
			break;
		case 8:
			System.out.println("The number you have entered is equal to August");
			break;
		case 9:
			System.out.println("The number you have entered is equal to September");
			break;
		case 10:
			System.out.println("The number you have entered is equal to October");
			break;
		case 11:
			System.out.println("The number you have entered is equal to November");
			break;
		case 12:
			System.out.println("The number you have entered is equal to Desember");
			break;
		default:
			System.out.println("You must entered the number from 1 to 12");

		}

	}

}
