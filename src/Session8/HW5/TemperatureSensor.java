package Session8.HW5;

import java.util.*;

class TemperatureSensor {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("\nNhiệt độ hiện tại: " + temp + "°C");

        for (Observer o : observers) {
            o.update(temp);
        }
    }
}