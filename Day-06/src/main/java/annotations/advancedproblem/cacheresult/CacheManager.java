package annotations.advancedproblem.cacheresult;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object getFromCache(Method method, Object[] args) {
        String key = generateCacheKey(method, args);
        return cache.get(key);
    }

    public static void putInCache(Method method, Object[] args, Object result) {
        String key = generateCacheKey(method, args);
        cache.put(key, result);
    }

    private static String generateCacheKey(Method method, Object[] args) {
        StringBuilder key = new StringBuilder(method.getName());
        for (Object arg : args) {
            key.append("_").append(arg);
        }
        return key.toString();
    }
}
