package Session1.HW6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public static void logError(String message) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("[ERROR] " +
                LocalDateTime.now().format(dtf) +
                " - " + message);
    }
}
