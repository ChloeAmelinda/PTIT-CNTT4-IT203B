package Session2.HW2;

import java.util.function.Predicate;

public class main {
    static void main(String[] args) {
        Predicate<String> checkPassword = n -> n.length() >=8;
        System.out.println(checkPassword.test("12345678"));
        System.out.println(checkPassword.test("1234"));
    }
}
