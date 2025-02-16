package reflection.intermediateproblem;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation (add, subtract, multiply): ");
        String operation = scanner.nextLine();

        System.out.println("Enter two integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            MathOperations mathOperations = new MathOperations();
            Method method = MathOperations.class.getMethod(operation, int.class, int.class);
            int result = (int) method.invoke(mathOperations, a, b);
            System.out.println("Result of " + operation + ": " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
