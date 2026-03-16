package Session1.HW3;

import Session1.HW5.InvalidAgeException;

public class User {

    private String name;
    private int age;

    public void setName(String name) {
        if (name != null) {   // phòng tránh NullPointerException
            this.name = name;
        }
    }

    public void printName() {
        if (name != null) {
            System.out.println("Ten: " + name);
        } else {
            System.out.println("Ten chua duoc cap nhat");
        }
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Tuoi khong hop le!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
