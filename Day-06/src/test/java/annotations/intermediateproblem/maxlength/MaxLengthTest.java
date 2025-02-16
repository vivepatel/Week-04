package annotations.intermediateproblem.maxlength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxLengthTest {

    @Test
    public void testValidUsername() {
        User user = new User("validName");
        assertEquals("validName", user.getUsername());
    }

    @Test
    public void testUsernameTooLong() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("ThisIsTooLong");
        });
        assertEquals("Username exceeds maximum length", exception.getMessage());
    }
}
