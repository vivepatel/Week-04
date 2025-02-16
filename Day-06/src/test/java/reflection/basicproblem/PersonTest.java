package reflection.basicproblem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Field;
public class PersonTest {
    @Test
    void testAccessAndModifyPrivateField() {
        Person person = new Person(25);
        assertEquals(25, person.getAge());

        try {
            Field field = Person.class.getDeclaredField("age");
            field.setAccessible(true);
            field.set(person, 35);

            assertEquals(35, person.getAge());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            fail("Exception occurred while accessing or modifying the field");
        }
    }
}
