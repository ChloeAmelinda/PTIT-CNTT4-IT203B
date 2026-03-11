package Session4.HW4;

public class passwordUtils {

    public static String evaluatePasswordStrength(String password) {
        if (password == null || password.length() < 8) {
            return "Weak";
        }

        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            return "Strong";
        }

        return "Weak";
    }
}