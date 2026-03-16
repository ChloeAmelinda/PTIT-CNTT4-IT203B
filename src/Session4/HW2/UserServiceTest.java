package Session4.HW2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService u = new UserService();
    @Test
    void checkRegistrationAge() {
        assertEquals(true,u.checkRegistrationAge(18));

    }
    @Test
    void check2() {
        assertEquals(true,u.checkRegistrationAge(17));

    }
    @Test
    void check3() {
        assertEquals(true,u.checkRegistrationAge(-1));

    }
}