package Session8.HW5;

class Light {
    private boolean isOn = true;

    public void off() {
        isOn = false;
        System.out.println("Đèn: Tắt");
    }

    public String getStatus() {
        return isOn ? "Bật" : "Tắt";
    }
}
