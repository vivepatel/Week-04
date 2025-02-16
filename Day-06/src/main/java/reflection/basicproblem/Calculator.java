package reflection.basicproblem;
import java.lang.reflect.Method;
public class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result = (int) method.invoke(calculator, 5, 10);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
