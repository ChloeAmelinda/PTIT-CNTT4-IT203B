package Session2.HW3;

public interface Authenticatable {
    String password = "";

    String getPassword();

    default boolean isAuthenticated(){
        if (password.isEmpty()){
            System.out.println("password empty.");
            return false;
        }
        return true;
    }

    static String encrypt(String rawPassword){
        return "password :" + rawPassword;
    }

}
