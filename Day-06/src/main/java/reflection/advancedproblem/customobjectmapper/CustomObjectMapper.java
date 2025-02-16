package reflection.advancedproblem.customobjectmapper;
import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws IllegalAccessException, InstantiationException {
        T instance = clazz.newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            if (properties.containsKey(fieldName)) {
                Object value = properties.get(fieldName);
                field.set(instance, value);
            }
        }
        return instance;
    }
}

