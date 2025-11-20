package firstOne;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("for rectangle press 1, for circle press 2 :");
		int menu = scan.nextInt();

		switch (menu) {

		case 1:
			System.out.println("Give the length :");
			double length = scan.nextDouble();

			System.out.println("Give the heigth :");
			double height = scan.nextDouble();

			Rectangle rect = new Rectangle(length, height);
			System.out.println("Area = " + rect.area());
			break;
		case 2:
			System.out.println("Give the rad :");
			double r = scan.nextDouble();

			Circle circle = new Circle(r);
			System.out.println("Area = " + circle.area());
			break;
		default:
			System.out.println("invalid: ");
		}
		scan.close();
	}
}
