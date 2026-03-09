package Session2.HW6;

public class main {
    public static void main(String[] args) {

        // Method Reference
        UserProcessor processor = UserUtils::convertToUpperCase;

        User user = new User("nguyen");

        String result = processor.process(user);

        System.out.println(result);

    }

}
