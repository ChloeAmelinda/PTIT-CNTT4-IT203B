package Session1.HW5;

import Session1.HW3.User;

public class main {
    public static void main(String[] args) {

        User u = new User();

        try {
            u.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Loi: " + e.getMessage());
        }

        System.out.println("Chuong trinh ket thuc!");
    }
}
