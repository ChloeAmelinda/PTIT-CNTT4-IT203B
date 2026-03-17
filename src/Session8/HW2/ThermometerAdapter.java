package Session8.HW2;

public class ThermometerAdapter implements TemperatureSensor{
    @Override
    public double getTemperatureCelsius() {
        int f = oldThermometer.getTemperatureFahrenheit();
        return (f - 32) * 5.0 / 9;
    }
    private OldThermometer oldThermometer;
    public ThermometerAdapter(OldThermometer oldThermometer){
        this.oldThermometer = oldThermometer;
    }

}
class SmartHomeFacade {
    private TemperatureSensor sensor;

    public SmartHomeFacade(TemperatureSensor sensor) {
        this.sensor = sensor;
    }
    public void leaveHome() {
        System.out.println("Facade: Rời nhà");
        System.out.println("→ Tắt đèn");
        System.out.println("→ Tắt quạt");
        System.out.println("→ Tắt điều hòa");
    }
    public void sleepMode() {
        System.out.println("Facade: Chế độ ngủ");
        System.out.println("→ Tắt đèn");
        System.out.println("→ Điều hòa: 28°C");
        System.out.println("→ Quạt: tốc độ thấp");
    }

    public void getCurrentTemperature() {
        double temp = sensor.getTemperatureCelsius();
        System.out.println("Nhiệt độ hiện tại: " + temp + "°C");
    }
}
