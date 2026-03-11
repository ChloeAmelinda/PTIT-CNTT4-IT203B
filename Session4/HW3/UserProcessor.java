package Session4.HW3;

public class UserProcessor {
    public String checkEmail(String email){
        if (!email.contains("@") || email.isEmpty()){
            throw new IllegalArgumentException("email ko hop le");
        }
        return email.toLowerCase();
    }
}
