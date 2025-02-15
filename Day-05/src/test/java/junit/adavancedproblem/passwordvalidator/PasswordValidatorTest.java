package junit.adavancedproblem.passwordvalidator;



import static org.junit.jupiter.api.Assertions.*;

import junit.adancedproblem.passwordvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.validate("Valid1234"), "Password should be valid.");
    }

    @Test
    public void testShortPassword() {
        assertFalse(validator.validate("Short1"), "Password should be invalid as it's too short.");
    }

    @Test
    public void testPasswordWithoutUppercase() {
        assertFalse(validator.validate("password123"), "Password should be invalid as it lacks an uppercase letter.");
    }

    @Test
    public void testPasswordWithoutDigit() {
        assertFalse(validator.validate("Password"), "Password should be invalid as it lacks a digit.");
    }

    @Test
    public void testPasswordWithoutUppercaseAndDigit() {
        assertFalse(validator.validate("password"), "Password should be invalid as it lacks both an uppercase letter and a digit.");
    }

    @Test
    public void testNullPassword() {
        assertFalse(validator.validate(null), "Null password should be invalid.");
    }
}