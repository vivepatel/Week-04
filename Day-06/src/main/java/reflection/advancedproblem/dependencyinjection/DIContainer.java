package reflection.advancedproblem.dependencyinjection;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {

    private Map<Class<?>, Object> registeredBeans = new HashMap<>();

    public void registerBean(Class<?> clazz) throws IllegalAccessException, InstantiationException {
        Object instance = clazz.newInstance();
        registeredBeans.put(clazz, instance);
    }

    public void injectDependencies(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);

                Class<?> fieldType = field.getType();

                if (registeredBeans.containsKey(fieldType)) {
                    Object dependency = registeredBeans.get(fieldType);
                    field.set(object, dependency);
                }
            }
        }
    }
}
