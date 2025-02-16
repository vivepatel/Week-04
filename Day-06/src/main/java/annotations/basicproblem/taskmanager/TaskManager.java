package annotations.basicproblem.taskmanager;
public class TaskManager {

    @ImportantMethod(level = "HIGH")
    public void performCriticalTask() {
        System.out.println("Performing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void performRegularTask() {
        System.out.println("Performing regular task...");
    }

    public void performOtherTask() {
        System.out.println("Performing other task...");
    }
}
