package annotations.basicproblem.taskmanager;
import java.lang.reflect.Method;

public class TaskManagerMain {

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method[] methods = taskManager.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Importance Level: " + importantMethod.level());
            }
        }
    }
}
