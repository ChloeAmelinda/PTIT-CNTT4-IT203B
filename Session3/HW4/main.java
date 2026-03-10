package Session3.HW4;

import java.util.*;
import java.util.stream.Collectors;

record User(String username) {}

public class main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("a"),
                new User("b"),
                new User("a"),
                new User("c"),
                new User("b")
        );

        Set<User> uniqueUsers = users.stream()
                .collect(Collectors.toSet());

        uniqueUsers.forEach(System.out::println);
    }
}
