package reflection.advancedproblem.customobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapperMain {
    public static void main(String[] args) {
        Map<String, Object> personProperties = new HashMap<>();
        personProperties.put("name", "John Doe");
        personProperties.put("age", 30);

        try {
            Person person = CustomObjectMapper.toObject(Person.class, personProperties);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
