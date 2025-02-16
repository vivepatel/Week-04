package annotations.intermediateproblem.logexecutiontime;

public class TaskManager {

    @LogExecutionTime
    public void taskOne() {
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Task One executed, result: " + sum);
    }

    @LogExecutionTime
    public void taskTwo() {
        long product = 1;
        for (int i = 1; i <= 50000; i++) {
            product *= i;
        }
        System.out.println("Task Two executed, result: " + product);
    }

    public void nonAnnotatedTask() {
        System.out.println("This method is not annotated for execution time logging.");
    }
}
