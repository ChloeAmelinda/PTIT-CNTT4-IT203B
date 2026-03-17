package Session8.HW1;

public class LightFactory extends DeviceFactory{

    @Override
    public device createdevice() {
        System.out.println("LightFactory: Đã tạo đèn mới.");

        return new Light();
    }
}
