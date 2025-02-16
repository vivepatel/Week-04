package reflection.advancedproblem.jsonconverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonConverterTest {

    @Test
    public void testToJson() throws IllegalAccessException {
        Person person = new Person("Ankit Patel", 25, false);
        String expectedJson = "{\"name\": \"Ankit Patel\", \"age\": 25, \"isEmployed\": false}";
        String json = JsonConverter.toJson(person);
        assertEquals(expectedJson, json);
    }

    @Test
    public void testToJsonEmptyObject() throws IllegalAccessException {
        Person person = new Person("", 0, false);
        String expectedJson = "{\"name\": \"\", \"age\": 0, \"isEmployed\": false}";
        String json = JsonConverter.toJson(person);
        assertEquals(expectedJson, json);
    }
}

