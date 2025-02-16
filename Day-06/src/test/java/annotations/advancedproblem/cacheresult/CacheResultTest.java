package annotations.advancedproblem.cacheresult;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CacheResultTest {

    @Test
    public void testExpensiveComputationWithCache() throws Exception {
        CachedComputation computation = new CachedComputation();
        Method method = CachedComputation.class.getMethod("expensiveComputation", int.class);

        int result1 = (int) computation.handleMethodInvocation(method, new Object[]{5});
        assertEquals(25, result1);

        int result2 = (int) computation.handleMethodInvocation(method, new Object[]{5});
        assertEquals(25, result2);
        int result3 = (int) computation.handleMethodInvocation(method, new Object[]{10});
        assertEquals(100, result3);
    }
}
