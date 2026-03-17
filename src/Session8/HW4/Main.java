package Session8.HW4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TemperatureSensor sensor = new TemperatureSensor();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Đăng ký Quạt");
            System.out.println("2. Đăng ký Máy tạo ẩm");
            System.out.println("3. Thay đổi nhiệt độ");
            System.out.println("4. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sensor.attach(new Fan());
                    break;

                case 2:
                    sensor.attach(new Humidifier());
                    break;

                case 3:
                    System.out.print("Nhập nhiệt độ: ");
                    int temp = sc.nextInt();
                    sensor.setTemperature(temp);
                    break;

                case 4:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Không hợp lệ!");
            }

        } while (choice != 4);
    }
}
