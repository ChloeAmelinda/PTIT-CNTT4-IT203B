package Session8.HW4;

class Fan implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature < 20) {
            System.out.println("Quạt: Tắt (trời lạnh)");
        } else if (temperature <= 25) {
            System.out.println("Quạt: Chạy mức trung bình");
        } else {
            System.out.println("Quạt: Chạy mạnh");
        }
    }
}
