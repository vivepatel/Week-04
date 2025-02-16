package annotations.basicproblem.todo;
import java.lang.reflect.Method;

public class TodoMain {

    public static void main(String[] args) throws Exception {
        TaskManager taskManager = new TaskManager();
        Method[] methods = taskManager.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
