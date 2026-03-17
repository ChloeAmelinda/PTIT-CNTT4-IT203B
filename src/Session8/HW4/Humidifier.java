package Session8.HW4;

class Humidifier implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature < 20) {
            System.out.println("Máy tạo ẩm: Tăng độ ẩm");
        } else if (temperature <= 25) {
            System.out.println("Máy tạo ẩm: Giữ mức ổn định");
        } else {
            System.out.println("Máy tạo ẩm: Giảm độ ẩm");
        }
    }
}