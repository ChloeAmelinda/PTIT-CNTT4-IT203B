package Session8.HW1;

public class Fan implements device{
    @Override
    public void turnOn() {
        System.out.println("turn on fan");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off fan");
    }
}
