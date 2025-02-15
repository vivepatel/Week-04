package junit.basicproblem.calculator;



public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 2));
        System.out.println("Multiplication: " + calculator.multiply(2, 3));
        try {
            System.out.println("Division: " + calculator.divide(6, 3));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}