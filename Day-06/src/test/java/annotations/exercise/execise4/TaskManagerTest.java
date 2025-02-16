package annotations.exercise.execise4;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
public class TaskManagerTest {

    @Test
    public void testTaskInfoAnnotation() throws NoSuchMethodException {
        TaskManager taskManager = new TaskManager();
        Method method = taskManager.getClass().getMethod("performTask");

        assertTrue(method.isAnnotationPresent(TaskInfo.class));

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        assertEquals(1, taskInfo.priority());
        assertEquals("Rononoa Zoro", taskInfo.assignedTo());
    }
}

