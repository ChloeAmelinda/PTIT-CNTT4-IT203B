package Session3.HW2;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        List<String> email = new ArrayList<>();
        email.add("alice@gmail.com");
        email.add("bob@yahoo.com");
        email.add("charlie@gmail.com");

        email.stream().filter(n -> n.endsWith("@gmail.com")).forEach(System.out::println);
    }
}
