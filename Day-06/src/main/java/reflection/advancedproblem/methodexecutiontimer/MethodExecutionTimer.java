package reflection.advancedproblem.methodexecutiontimer;
import java.lang.reflect.Method;

public class MethodExecutionTimer {

    public static Object executeWithTiming(Object target, String methodName, Object... params) throws Exception {
        Method method = findMethod(target.getClass(), methodName, params);
        long startTime = System.nanoTime();
        Object result = method.invoke(target, params);
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime) / 1000000;
        System.out.println("Method " + methodName + " executed in " + elapsedTime + " milliseconds.");
        return result;
    }

    private static Method findMethod(Class<?> clazz, String methodName, Object[] params) throws NoSuchMethodException {
        Class<?>[] paramTypes = new Class<?>[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
        return clazz.getMethod(methodName, paramTypes);
    }
}
