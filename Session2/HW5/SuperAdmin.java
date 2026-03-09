package Session2.HW5;

public class SuperAdmin implements UserActions,AdminActions {
    @Override
    public void logActivity(String activity) {

        // chọn dùng method của AdminActions
        AdminActions.super.logActivity(activity);

    }

}
