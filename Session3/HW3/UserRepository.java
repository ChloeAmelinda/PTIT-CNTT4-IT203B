package Session3.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

record User(String name){}
public class UserRepository {
    List<User>  users= new ArrayList<>();
    public UserRepository(){
        users.add(new User("alice"));
    }
    Optional<User> findUserByUsername(String username){
        return users.stream().filter(u -> u.name().equals(username)).findFirst();
    }

}
