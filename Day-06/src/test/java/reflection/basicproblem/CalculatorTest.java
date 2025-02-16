package reflection.basicproblem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
public class CalculatorTest {
    @Test
    void testInvokePrivateMethod() {
        try {
            Calculator calculator = new Calculator();
            Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result = (int) method.invoke(calculator, 5, 10);
            assertEquals(50, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while invoking the private method");
        }
    }
}
