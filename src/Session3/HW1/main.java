package Session3.HW1;

import java.util.ArrayList;
import java.util.List;
record User(String name,String email, String status){}

public class main {
    static void main(String[] args) {
        List<User> u = new ArrayList<>();
        u.add(new User("A" , "a@gmail.com","active"));
        u.add(new User("B" , "b@gmail.com","inactive"));
        u.add(new User("C" , "c@gmail.com","active"));
         u.forEach(System.out::println);

    }
}
