package Session4.HW2;

public class UserService {
    public boolean checkRegistrationAge(int age){
        if (age >18){
            throw new IllegalArgumentException("chỉ được phép đăng ký tài khoản nếu từ 18 tuổi trở lên");
        }
        if (age <0){
            throw new IllegalArgumentException("tuổi nhập vào ko dc là số âm");
        }

        return true;
    }
}
