package Session8.HW5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // thiết bị
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();

        // sensor
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.attach(fan);
        sensor.attach(ac);

        // tạo macro command
        SleepModeCommand sleep = new SleepModeCommand();
        sleep.addCommand(new LightCommand(light));
        sleep.addCommand(new ACSetCommand(ac));
        sleep.addCommand(new FanLowCommand(fan));

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Kích hoạt chế độ ngủ");
            System.out.println("2. Thay đổi nhiệt độ");
            System.out.println("3. Xem trạng thái thiết bị");
            System.out.println("4. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sleep.execute();
                    break;

                case 2:
                    System.out.print("Nhập nhiệt độ: ");
                    int temp = sc.nextInt();
                    sensor.setTemperature(temp);
                    break;

                case 3:
                    System.out.println(light.getStatus());
                    System.out.println(fan.getStatus());
                    System.out.println(ac.getStatus());
                    break;

                case 4:
                    System.out.println("Bye!");
                    break;
            }

        } while (choice != 4);
    }
}
