package reflection.advancedproblem.methodexecutiontimer;
public class HelloClass {

    public void sayHello(String name) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Hello, " + name);
    }

    public int addNumbers(int a, int b) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return a + b;
    }
}

