package annotations.basicproblem.todo;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
public class TodoTest {

    @Test
    public void testTodoAnnotation() throws NoSuchMethodException {
        TaskManager taskManager = new TaskManager();

        Method loginMethod = taskManager.getClass().getMethod("implementLogin");
        Method databaseMethod = taskManager.getClass().getMethod("setupDatabase");
        Method uiMethod = taskManager.getClass().getMethod("designUI");

        assertTrue(loginMethod.isAnnotationPresent(Todo.class));
        assertTrue(databaseMethod.isAnnotationPresent(Todo.class));
        assertTrue(uiMethod.isAnnotationPresent(Todo.class));

        Todo loginTodo = loginMethod.getAnnotation(Todo.class);
        Todo databaseTodo = databaseMethod.getAnnotation(Todo.class);
        Todo uiTodo = uiMethod.getAnnotation(Todo.class);

        assertEquals("Implement login feature", loginTodo.task());
        assertEquals("Alice", loginTodo.assignedTo());
        assertEquals("HIGH", loginTodo.priority());

        assertEquals("Set up database", databaseTodo.task());
        assertEquals("Bob", databaseTodo.assignedTo());
        assertEquals("MEDIUM", databaseTodo.priority());

        assertEquals("Design user interface", uiTodo.task());
        assertEquals("Charlie", uiTodo.assignedTo());
        assertEquals("LOW", uiTodo.priority());
    }
}
