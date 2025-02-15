package junit.basicproblems.exeptionhandling;



import static org.junit.jupiter.api.Assertions.*;

import junit.basicproblem.exeptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(10, 0));
    }

    @Test
    public void testDivideNormal() {
        assertEquals(5, exceptionHandling.divide(10, 2));
    }
}