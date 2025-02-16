package reflection.advancedproblem.customobjectmapper;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomObjectMapperTest {

    @Test
    public void testToObject() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Ankit Patel");
        properties.put("age", 25);

        Person person = CustomObjectMapper.toObject(Person.class, properties);

        assertEquals("Ankit Patel", person.getName());
        assertEquals(25, person.getAge());
    }
}

