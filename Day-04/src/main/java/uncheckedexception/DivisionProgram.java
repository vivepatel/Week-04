package uncheckedexception;

import java.util.Scanner;
import java.util.InputMismatchException;

class DivisionProgram {

    // Method to perform division with exception handling
    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        performDivision();
    }
}
