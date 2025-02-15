package junit.adancedproblem.userregistration;



import java.util.regex.Pattern;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if (username == null || username.length() < 5) {
            throw new IllegalArgumentException("Username must be at least 5 characters long.");
        }
        if (email == null || !isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("ankitPatel", "yugap1806@gmail.com", "Passw0rd123");
            System.out.println("User registered successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}