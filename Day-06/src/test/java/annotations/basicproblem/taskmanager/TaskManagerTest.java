package annotations.basicproblem.taskmanager;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testImportantMethodAnnotation() throws NoSuchMethodException {
        TaskManager taskManager = new TaskManager();
        Method criticalTask = taskManager.getClass().getMethod("performCriticalTask");
        Method regularTask = taskManager.getClass().getMethod("performRegularTask");

        assertTrue(criticalTask.isAnnotationPresent(ImportantMethod.class));
        assertTrue(regularTask.isAnnotationPresent(ImportantMethod.class));

        ImportantMethod criticalTaskAnnotation = criticalTask.getAnnotation(ImportantMethod.class);
        ImportantMethod regularTaskAnnotation = regularTask.getAnnotation(ImportantMethod.class);

        assertEquals("HIGH", criticalTaskAnnotation.level());
        assertEquals("MEDIUM", regularTaskAnnotation.level());
    }
}
