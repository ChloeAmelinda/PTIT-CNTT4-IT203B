package Session4.HW5;

record User(String username , String role){}
public class AuthorizationService {

    public static boolean canPerformAction(User user, String action) {

        String role = user.role();

        if (role.equals("ADMIN")) {
            return action.equals("DELETE_USER")
                    || action.equals("LOCK_USER")
                    || action.equals("VIEW_PROFILE");
        }

        if (role.equals("MODERATOR")) {
            return action.equals("LOCK_USER")
                    || action.equals("VIEW_PROFILE");
        }

        if (role.equals("USER")) {
            return action.equals("VIEW_PROFILE");
        }

        return false;
    }
}