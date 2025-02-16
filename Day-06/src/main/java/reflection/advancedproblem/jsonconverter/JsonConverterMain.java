package reflection.advancedproblem.jsonconverter;
public class JsonConverterMain {
    public static void main(String[] args) {
        Person person = new Person("Alice", 28, true);

        try {
            String json = JsonConverter.toJson(person);
            System.out.println(json);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
