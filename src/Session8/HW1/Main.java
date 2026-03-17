package Session8.HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<device> devices = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice  = 0;
        do {
            System.out.println("1.Kết nối phần cứng (lấy instance Singleton).");
            System.out.println("2.Tạo thiết bị mới");
            System.out.println("3.Bật/tắt thiết bị vừa tạo.");
            System.out.println("4.Thoát");

            System.out.println("Nhap lua chon :");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    HardwareConnection.getInstance();
                    break;
                case 2:
                    System.out.println("chon loai den : 1. Đèn, 2. Quạt, 3. Điều hòa");
                    int choice2 = sc.nextInt();
                    sc.nextLine();
                    DeviceFactory factory = null;
                    if (choice2 == 1){
                        factory= new LightFactory();
                    } else if (choice2 == 2) {
                        factory = new FanFactory();
                    } else if (choice2 == 3) {
                        factory = new AirConditionerFactory();
                    }
                    device device = factory.createdevice();
                    devices.add(device);
                    break;
                case 3:
                    System.out.println("Chọn thiết bị vừa tạo: ");
                    int input = sc.nextInt()-1;
                    sc.nextLine();
                    if (input < 1 || input > 3){
                        System.out.println("Nhap sai");
                        break;
                    }
                    devices.get(input).turnOn();
                    devices.get(input).turnOff();
                    break;
                case 4:
                    System.out.println("bye");
                    break;
                default:
                    break;

            }
        }while (choice != 4);

    }
}
