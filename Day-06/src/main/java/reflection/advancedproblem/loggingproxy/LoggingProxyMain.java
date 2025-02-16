package reflection.advancedproblem.loggingproxy;
public class LoggingProxyMain {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting loggingGreeting = LoggingProxy.createProxy(greeting);

        loggingGreeting.sayHello("Monkey D Luffy");
    }
}
