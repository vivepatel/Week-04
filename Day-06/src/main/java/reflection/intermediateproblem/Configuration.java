package reflection.intermediateproblem;
import java.lang.reflect.Field;
public class Configuration {

    public static final Object API_KEY = "default-api-key";


    public static void main(String[] args) {
        try {
            Class<?> clazz = Configuration.class;
            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true);

            System.out.println("Original API_KEY: " + API_KEY);

            field.set(null, "new-api-key-12345");

            System.out.println("Modified API_KEY: " + API_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
