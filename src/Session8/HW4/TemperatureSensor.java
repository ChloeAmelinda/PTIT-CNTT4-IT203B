package Session8.HW4;

import java.util.ArrayList;
import java.util.List;

class TemperatureSensor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void attach(Observer o) {
        observers.add(o);
        System.out.println("Đã đăng ký thiết bị.");
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
        System.out.println("Đã hủy đăng ký thiết bị.");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        System.out.println("\nNhiệt độ thay đổi: " + temperature + "°C");
        this.temperature = temperature;
        notifyObservers();
    }
}
