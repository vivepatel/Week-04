package annotations.advancedproblem.jsonfield;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JsonFieldTest {

    @Test
    public void testJsonSerialization() {
        User user = new User("Ankit Patel", 25);
        String expectedJson = "{\"user_name\": \"Ankit Patel\", \"user_age\": \"25\"}";
        String actualJson = JsonSerializer.toJson(user);

        assertEquals(expectedJson, actualJson);
    }
}
