package Session2.HW3;

public class main {
    static void main(String[] args) {
        Authenticatable a = new Authenticatable() {

            public String getPassword() {
                return password;
            }
        };
        System.out.println(a.isAuthenticated());
        System.out.println(Authenticatable.encrypt("123"));
    }
}
