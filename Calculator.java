package second;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = 0;

		while (n != 3) {
			System.out.println("PLEASE Enter 1 for Add, Enter 2 for Subtract, enter 3 for Exit:");

			n = scan.nextInt();
			switch (n) {

			case 1:
				System.out.println("Enter the first number: ");
				double a = scan.nextInt();

				System.out.println("Enter the second number: ");
				double b = scan.nextInt();
				System.out.println();

				System.out.println("The resunt is: " + (a + b));
				System.out.println();
				break;

			case 2:
				System.out.println("Enter the first number: ");
				double c = scan.nextInt();

				System.out.println("Enter the second number: ");
				double d = scan.nextInt();
				System.out.println();
				System.out.println("The resunt is: " + (c - d));

			case 3:
				System.out.println("Exit: ");
				break;

			default:
				System.out.println("Invalid");
			}
		}
		scan.close();
	}
}
