package Session4.HW4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class passwordUtilsTest {

    @Test
    void evaluatePasswordStrength() {

        assertAll("Password strength tests",

                () -> assertEquals("Strong",
                        passwordUtils.evaluatePasswordStrength("Abcdef1!")),

                () -> assertEquals("Weak",
                        passwordUtils.evaluatePasswordStrength("abcdef1!")), // thiếu chữ hoa

                () -> assertEquals("Weak",
                        passwordUtils.evaluatePasswordStrength("Abcdef12")), // thiếu ký tự đặc biệt

                () -> assertEquals("Weak",
                        passwordUtils.evaluatePasswordStrength("Ab1!")) // quá ngắn
        );
    }
}