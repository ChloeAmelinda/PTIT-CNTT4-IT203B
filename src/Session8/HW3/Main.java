package Session8.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();

        RemoteControl remote = new RemoteControl();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Bật đèn");
            System.out.println("2. Tắt đèn");
            System.out.println("3. Bật quạt");
            System.out.println("4. Tắt quạt");
            System.out.println("5. Đặt nhiệt độ điều hòa");
            System.out.println("6. Undo");
            System.out.println("7. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    remote.pressButton(new LightOnCommand(light));
                    break;

                case 2:
                    remote.pressButton(new LightOffCommand(light));
                    break;

                case 3:
                    remote.pressButton(new FanOnCommand(fan));
                    break;

                case 4:
                    remote.pressButton(new FanOffCommand(fan));
                    break;

                case 5:
                    System.out.print("Nhập nhiệt độ: ");
                    int temp = sc.nextInt();
                    remote.pressButton(new ACSetTemperatureCommand(ac, temp));
                    break;

                case 6:
                    remote.undo();
                    break;

                case 7:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Không hợp lệ!");
            }

        } while (choice != 7);
    }
}
