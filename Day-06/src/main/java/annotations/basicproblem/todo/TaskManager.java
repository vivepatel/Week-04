package annotations.basicproblem.todo;
public class TaskManager {

    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void implementLogin() {
        System.out.println("Implementing login...");
    }

    @Todo(task = "Set up database", assignedTo = "Bob")
    public void setupDatabase() {
        System.out.println("Setting up database...");
    }

    @Todo(task = "Design user interface", assignedTo = "Charlie", priority = "LOW")
    public void designUI() {
        System.out.println("Designing UI...");
    }

    public void completeTask() {
        System.out.println("Task completed.");
    }
}
