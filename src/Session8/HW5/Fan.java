package Session8.HW5;

class Fan implements Observer {
    private String speed = "OFF";

    public void setLow() {
        speed = "LOW";
        System.out.println("Quạt: chạy thấp");
    }

    public void setHigh() {
        speed = "HIGH";
        System.out.println("Quạt: chạy mạnh");
    }

    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            setHigh();
        }
    }

    public String getStatus() {
        return "Quạt: " + speed;
    }
}
