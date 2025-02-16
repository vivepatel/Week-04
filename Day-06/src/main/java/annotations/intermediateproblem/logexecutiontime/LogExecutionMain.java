package annotations.intermediateproblem.logexecutiontime;
import java.lang.reflect.Method;

public class LogExecutionMain {

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method[] methods = taskManager.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(taskManager);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + duration + " nanoseconds");
            }
        }
    }
}
