package firstOne;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double a = scan.nextDouble();

        System.out.println("For add enter 1, for mult enter 2, for divide enter 3, for minus enter 4:");
        int symbol = scan.nextInt();

        System.out.println("Please enter second number:");
        double b = scan.nextDouble();

        switch (symbol) {
            case 1:
                System.out.println("The result is: " + add(a, b));
                break;

            case 2:
                System.out.println("The result is: " + product(a, b));
                break;

            case 3:
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero.");
                } else {
                    System.out.println("The result is: " + quotient(a, b));
                }
                break;

            case 4:
                System.out.println("The result is: " + diff(a, b));
                break;

            default:
                System.out.println("Invalid option. Please enter 1–4.");
        }

        scan.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double product(double a, double b) {
        return a * b;
    }

    public static double quotient(double a, double b) {
        return a / b;
    }
}
