package Session4.HW3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserProcessorTest {
    UserProcessor a;
    @BeforeEach
    void setUp() {
        a = new UserProcessor();
    }

    @Test
    void checkEmail() {
        assertEquals("user@gmail.com",a.checkEmail("user@gmail.com"));
    }
    @Test
    void checkEmail2() {
        assertEquals("user@",a.checkEmail("user@"));
    }

}