package reflection.intermediateproblem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

public class MathOperationsTest {

    @Test
    void testAddMethod() {
        try {
            MathOperations mathOperations = new MathOperations();
            Method method = MathOperations.class.getMethod("add", int.class, int.class);
            int result = (int) method.invoke(mathOperations, 5, 3);
            assertEquals(8, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while invoking the add method");
        }
    }

    @Test
    void testSubtractMethod() {
        try {
            MathOperations mathOperations = new MathOperations();
            Method method = MathOperations.class.getMethod("subtract", int.class, int.class);
            int result = (int) method.invoke(mathOperations, 5, 3);
            assertEquals(2, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while invoking the subtract method");
        }
    }

    @Test
    void testMultiplyMethod() {
        try {
            MathOperations mathOperations = new MathOperations();
            Method method = MathOperations.class.getMethod("multiply", int.class, int.class);
            int result = (int) method.invoke(mathOperations, 5, 3);
            assertEquals(15, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while invoking the multiply method");
        }
    }

    @Test
    void testInvalidMethod() {
        try {
            MathOperations mathOperations = new MathOperations();
            Method method = MathOperations.class.getMethod("divide", int.class, int.class);
            method.invoke(mathOperations, 5, 3);
            fail("Exception should have been thrown for invalid method");
        } catch (NoSuchMethodException e) {
            assertTrue(true); // Expected exception for invalid method
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unexpected exception occurred");
        }
    }
}
