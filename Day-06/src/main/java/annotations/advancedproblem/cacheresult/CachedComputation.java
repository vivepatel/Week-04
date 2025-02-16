package annotations.advancedproblem.cacheresult;

import java.lang.reflect.Method;

public class CachedComputation {

    @CacheResult
    public int expensiveComputation(int num) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return num * num;
    }

    public Object handleMethodInvocation(Method method, Object[] args) throws Exception {

        if (method.isAnnotationPresent(CacheResult.class)) {
            Object cachedResult = CacheManager.getFromCache(method, args);
            if (cachedResult != null) {
                System.out.println("Returning cached result.");
                return cachedResult;
            }
            Object result = method.invoke(this, args);
            CacheManager.putInCache(method, args, result);
            return result;
        }

        return method.invoke(this, args);
    }
}
