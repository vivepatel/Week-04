package annotations.advancedproblem.jsonfield;

import java.lang.reflect.Field;
public class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);

                try {
                    if (!first) {
                        json.append(", ");
                    }
                    json.append("\"")
                            .append(jsonField.name())
                            .append("\": \"")
                            .append(field.get(obj))
                            .append("\"");
                    first = false;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}
