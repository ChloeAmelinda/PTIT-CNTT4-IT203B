package Session3.HW5;

import java.util.*;

record User(String username) {}

public class main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("a"),
                new User("abcd"),
                new User("ab")

        );

        users.stream()
                .sorted((u1, u2) -> u2.username().length() - u1.username().length())
                .limit(3)
                .forEach(u -> System.out.println(u.username()));
    }
}
