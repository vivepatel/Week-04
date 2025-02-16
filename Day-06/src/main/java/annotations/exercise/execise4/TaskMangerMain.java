package annotations.exercise.execise4;
import java.lang.reflect.Method;

public class TaskMangerMain {

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method method = taskManager.getClass().getMethod("performTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        } else {
            System.out.println("No TaskInfo annotation present.");
        }
    }
}
