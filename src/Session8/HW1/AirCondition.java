package Session8.HW1;

public class AirCondition implements device{

    @Override
    public void turnOn() {
        System.out.println("turn out AirCondition");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off airCondition");
    }
}
