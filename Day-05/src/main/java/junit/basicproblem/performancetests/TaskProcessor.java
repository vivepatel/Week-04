package junit.basicproblem.performancetests;


public class TaskProcessor {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }

    public static void main(String[] args) {
        TaskProcessor taskProcessor = new TaskProcessor();
        try {
            System.out.println(taskProcessor.longRunningTask());
        } catch (InterruptedException e) {
            System.out.println("Task was interrupted");
        }
    }
}