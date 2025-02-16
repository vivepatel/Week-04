package reflection.advancedproblem.loggingproxy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggingProxyTest {

    @Test
    public void testLoggingProxy() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        Greeting greeting = new GreetingImpl();
        Greeting loggingGreeting = LoggingProxy.createProxy(greeting);
        loggingGreeting.sayHello("Monkey D Luffy");
        String output = outputStream.toString();
        assertTrue(output.contains("Method called: sayHello"));
        assertTrue(output.contains("Hello, Monkey D Luffy"));
    }
}
