package Session8.HW5;

class AirConditioner implements Observer {
    private int temperature = 25;

    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Điều hòa: set " + temp + "°C");
    }

    @Override
    public void update(int temp) {
        if (temp > 30) {
            System.out.println("Điều hòa: giảm nhiệt do trời nóng");
            setTemperature(26);
        }
    }

    public String getStatus() {
        return "Điều hòa: " + temperature + "°C";
    }
}