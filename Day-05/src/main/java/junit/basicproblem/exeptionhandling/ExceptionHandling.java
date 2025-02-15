package junit.basicproblem.exeptionhandling;



public class ExceptionHandling {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            System.out.println(exceptionHandling.divide(10, 0));  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}