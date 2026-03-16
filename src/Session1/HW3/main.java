package Session1.HW3;

import Session1.HW5.InvalidAgeException;

public class main {
    public static void main(String[] args) {

        User a = new User();
        try {
            a.setAge(12);
            a.setAge(-33);
        } catch (InvalidAgeException e) {
            System.out.println("Loi: " + e.getMessage());
        }

    }
}