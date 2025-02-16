package reflection.advancedproblem.methodexecutiontimer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodExecutionTimerTest {

    @Test
    public void testExecuteWithTiming() {
        HelloClass example = new HelloClass();

        try {
            long startTime = System.nanoTime();
            MethodExecutionTimer.executeWithTiming(example, "sayHello", "Alice");
            long endTime = System.nanoTime();
            long elapsedTime = (endTime - startTime) / 1000000;
            assertTrue(elapsedTime >= 500);

            startTime = System.nanoTime();
            MethodExecutionTimer.executeWithTiming(example, "addNumbers", 5, 10);
            endTime = System.nanoTime();
            elapsedTime = (endTime - startTime) / 1000000;
            assertTrue(elapsedTime >= 300);
        } catch (Exception e) {
            fail("Exception should not occur during method execution.");
        }
    }
}
