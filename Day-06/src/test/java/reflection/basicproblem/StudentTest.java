package reflection.basicproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;

public class StudentTest {

    @Test
    void testCreateStudentObjectDynamically() {
        try {
            Class<?> clazz = Class.forName("reflection.basicproblem.Student");
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object student = constructor.newInstance("Ankit Patel", 20);
            assertNotNull(student);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while creating student object dynamically");
        }
    }
}
