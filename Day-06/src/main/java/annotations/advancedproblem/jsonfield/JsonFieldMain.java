package annotations.advancedproblem.jsonfield;

public class JsonFieldMain {

    public static void main(String[] args) {
        User user = new User("Ankit Patel", 25);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
