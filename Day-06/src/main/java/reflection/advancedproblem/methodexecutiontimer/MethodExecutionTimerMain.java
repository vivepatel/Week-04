package reflection.advancedproblem.methodexecutiontimer;
public class MethodExecutionTimerMain {

    public static void main(String[] args) {
        try {
            HelloClass example = new HelloClass();
            MethodExecutionTimer.executeWithTiming(example, "sayHello", "Alice");
            MethodExecutionTimer.executeWithTiming(example, "addNumbers", 5, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
