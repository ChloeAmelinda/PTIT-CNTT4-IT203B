package Session4.HW5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationServiceTest {

    User admin;
    User moderator;
    User user;

    @Test
    void testAdminPermissions() {

        admin = new User("admin", "ADMIN");

        assertAll("ADMIN permissions",
                () -> assertTrue(AuthorizationService.canPerformAction(admin, "DELETE_USER")),
                () -> assertTrue(AuthorizationService.canPerformAction(admin, "LOCK_USER")),
                () -> assertTrue(AuthorizationService.canPerformAction(admin, "VIEW_PROFILE"))
        );
    }

    @Test
    void testModeratorPermissions() {

        moderator = new User("mod", "MODERATOR");

        assertAll("MODERATOR permissions",
                () -> assertFalse(AuthorizationService.canPerformAction(moderator, "DELETE_USER")),
                () -> assertTrue(AuthorizationService.canPerformAction(moderator, "LOCK_USER")),
                () -> assertTrue(AuthorizationService.canPerformAction(moderator, "VIEW_PROFILE"))
        );
    }

    @Test
    void testUserPermissions() {

        user = new User("user", "USER");

        assertAll("USER permissions",
                () -> assertFalse(AuthorizationService.canPerformAction(user, "DELETE_USER")),
                () -> assertFalse(AuthorizationService.canPerformAction(user, "LOCK_USER")),
                () -> assertTrue(AuthorizationService.canPerformAction(user, "VIEW_PROFILE"))
        );
    }

    @AfterEach
    void cleanup() {
        admin = null;
        moderator = null;
        user = null;
    }
}