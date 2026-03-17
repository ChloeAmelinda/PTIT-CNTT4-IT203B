package Session8.HW1;

public class FanFactory extends DeviceFactory{

    @Override
    public device createdevice() {

        System.out.println("created");
        return new Fan();
    }
}
