package Session8.HW3;

public interface Command {
    void Execute();
    void Undo();
}

class Light {
    public void on() {
        System.out.println("Đèn: Bật");
    }

    public void off() {
        System.out.println("Đèn: Tắt");
    }
}
class Fan {
    public void on() {
        System.out.println("Quạt: Bật");
    }

    public void off() {
        System.out.println("Quạt: Tắt");
    }
}
class AirConditioner {
    private int temperature = 25;

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Điều hòa: đặt " + temp + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }



    @Override
    public void Execute() {
        light.on();
    }

    @Override
    public void Undo() {
        light.off();
    }
}
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void Execute() {
        light.off();
    }

    @Override
    public void Undo() {
        light.on();

    }


}
class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void Execute() {
        fan.on();
    }

    public void Undo() {
        fan.off();
    }
}
class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
@Override
    public void Execute() {
        fan.off();
    }

    public void Undo() {
        fan.on();
    }
}
class ACSetTemperatureCommand implements Command {
    private AirConditioner ac;
    private int newTemp;
    private int prevTemp;

    public ACSetTemperatureCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }
@Override
    public void Execute() {
        prevTemp = ac.getTemperature(); // lưu trạng thái cũ
        ac.setTemperature(newTemp);
    }

    public void Undo() {
        ac.setTemperature(prevTemp); // rollback
    }
}