package annotations.exercise.execise5;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testBugReportsAnnotation() throws NoSuchMethodException {
        TaskManager taskManager = new TaskManager();
        Method method = taskManager.getClass().getMethod("performTask");

        assertTrue(method.isAnnotationPresent(BugReports.class));

        BugReports bugReports = method.getAnnotation(BugReports.class);
        BugReport[] reports = bugReports.value();

        assertEquals(2, reports.length);
        assertEquals("Null pointer exception on input validation", reports[0].description());
        assertEquals("Out of memory error on large data sets", reports[1].description());
    }
}
