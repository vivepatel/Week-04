package annotations.intermediateproblem.maxlength;
public class MaxLengthMain {

    public static void main(String[] args) {
        try {
            User user1 = new User("validName");
            System.out.println("User created with username: " + user1.getUsername());
            User user2 = new User("ThisIsTooLong");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
