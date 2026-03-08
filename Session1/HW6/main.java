package Session1.HW6;

import Session1.HW3.User;
import Session1.HW5.InvalidAgeException;

public class main {
    public static void main(String[] args) {

        User user = new User();

        user.setName("An");
        user.printName();

        try {

            user.setAge(-10);

        } catch (InvalidAgeException e) {

            Logger.logError(e.getMessage());

        }

        System.out.println("Chuong trinh ket thuc.");
    }
}

