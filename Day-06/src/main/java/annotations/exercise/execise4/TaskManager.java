package annotations.exercise.execise4;

public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Rononoa Zoro")
    public void performTask() {
        System.out.println("Performing task...");
    }
}
