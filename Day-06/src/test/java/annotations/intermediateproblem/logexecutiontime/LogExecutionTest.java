package annotations.intermediateproblem.logexecutiontime;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class LogExecutionTest {

    @Test
    public void testExecutionTimeLogging() throws Exception {
        TaskManager taskManager = new TaskManager();

        Method taskOneMethod = taskManager.getClass().getMethod("taskOne");
        Method taskTwoMethod = taskManager.getClass().getMethod("taskTwo");

        assertTrue(taskOneMethod.isAnnotationPresent(LogExecutionTime.class));
        assertTrue(taskTwoMethod.isAnnotationPresent(LogExecutionTime.class));

        taskOneMethod.invoke(taskManager);
        taskTwoMethod.invoke(taskManager);
    }
}
