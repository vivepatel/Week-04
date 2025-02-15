package junit.adavancedproblem.userregistration;



import static org.junit.jupiter.api.Assertions.*;

import junit.adancedproblem.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    public void testValidRegistration() {
        try {
            registration.registerUser("johnDoe", "john@example.com", "Password123");
        } catch (IllegalArgumentException e) {
            fail("Valid user should not throw an exception.");
        }
    }

    @Test
    public void testShortUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "john@example.com", "Password123");
        });
        assertEquals("Username must be at least 5 characters long.", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", "invalid-email", "Password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    @Test
    public void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", "john@example.com", "pass");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", "john@example.com", "password123");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    public void testPasswordWithoutDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", "john@example.com", "Password");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    @Test
    public void testNullUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, "john@example.com", "Password123");
        });
        assertEquals("Username must be at least 5 characters long.", exception.getMessage());
    }

    @Test
    public void testNullEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", null, "Password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    @Test
    public void testNullPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("johnDoe", "john@example.com", null);
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }
}