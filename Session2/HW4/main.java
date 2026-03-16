package Session2.HW4;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {

        // Tạo danh sách users
        List<User> users = Arrays.asList(
                new User("An"),
                new User("Binh"),
                new User("Cuong")
        );

        // 1. (user) -> user.getName()  -> User::getName
        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        // 2. (s) -> System.out.println(s) -> System.out::println
        List<String> list = Arrays.asList("Java", "Python", "C++");
        list.forEach(System.out::println);

        // 3. () -> new User() -> User::new
        Supplier<User> supplier = User::new;
        User u = supplier.get();

        System.out.println("User moi: " + u.getName());
    }

}
