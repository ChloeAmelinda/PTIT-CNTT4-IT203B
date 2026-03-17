package Session8.HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dùng adapter
        OldThermometer oldThermometer = new OldThermometer();
        TemperatureSensor sensor = new ThermometerAdapter(oldThermometer);

        SmartHomeFacade facade = new SmartHomeFacade(sensor);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem nhiệt độ hiện tại");
            System.out.println("2. Rời nhà");
            System.out.println("3. Chế độ ngủ");
            System.out.println("4. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    facade.getCurrentTemperature();
                    break;

                case 2:
                    facade.leaveHome();
                    break;

                case 3:
                    facade.sleepMode();
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