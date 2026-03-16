package Session4.HW1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator valid = new UserValidator();

    @Test
    void testValidUsername() {
        String username = "user123";
        boolean result = valid.isValidUsername(username);

        assertTrue(result);
    }

    @Test
    void testTooShortUsername() {
        String username = "abc";
        boolean result = valid.isValidUsername(username);

        assertFalse(result);
    }
}