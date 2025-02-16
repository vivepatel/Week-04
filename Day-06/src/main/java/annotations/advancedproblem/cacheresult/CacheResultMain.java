package annotations.advancedproblem.cacheresult;
import java.lang.reflect.Method;

public class CacheResultMain {

    public static void main(String[] args) throws Exception {
        CachedComputation computation = new CachedComputation();
        Method method = CachedComputation.class.getMethod("expensiveComputation", int.class);


        System.out.println("Result: " + computation.handleMethodInvocation(method, new Object[]{5}));

        System.out.println("Result: " + computation.handleMethodInvocation(method, new Object[]{5}));


        System.out.println("Result: " + computation.handleMethodInvocation(method, new Object[]{10}));
    }
}
