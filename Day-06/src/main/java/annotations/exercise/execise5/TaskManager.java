package annotations.exercise.execise5;

public class TaskManager {

    @BugReport(description = "Null pointer exception on input validation")
    @BugReport(description = "Out of memory error on large data sets")
    public void performTask() {
        System.out.println("Performing task...");
    }
}
