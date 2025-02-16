package reflection.intermediateproblem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

public class ConfigurationTest {

    @Test
    void testModifyStaticField() {
        try {
            Class<?> clazz = Configuration.class;
            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true);

            assertEquals("default-api-key", Configuration.API_KEY);

            field.set(null, "test-api-key-67890");

            assertEquals("test-api-key-67890", Configuration.API_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while modifying the static field");
        }
    }

    @Test
    void testFieldAccessibility() {
        try {
            Class<?> clazz = Configuration.class;
            Field field = clazz.getDeclaredField("API_KEY");

            assertFalse(field.canAccess(null));

            field.setAccessible(true);
            assertTrue(field.canAccess(null));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception occurred while checking field accessibility");
        }
    }
}
