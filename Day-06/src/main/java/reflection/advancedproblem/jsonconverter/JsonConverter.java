package reflection.advancedproblem.jsonconverter;
import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object object) throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        Field[] fields = object.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = field.get(object);

            if (!firstField) {
                jsonBuilder.append(", ");
            }
            firstField = false;

            jsonBuilder.append("\"").append(fieldName).append("\": ");

            if (fieldValue instanceof String) {
                jsonBuilder.append("\"").append(fieldValue).append("\"");
            } else {
                jsonBuilder.append(fieldValue);
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
