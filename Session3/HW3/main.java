package Session3.HW3;

import java.util.Optional;

public class main {
    static void main(String[] args) {
        UserRepository repo = new UserRepository();

        Optional<User> user = repo.findUserByUsername("alice");

        user.ifPresentOrElse(
                u -> System.out.println("Welcome " + u.name()),
                () -> System.out.println("Guest login")
        );
    }
}
