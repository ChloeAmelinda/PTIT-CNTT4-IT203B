package Session8.HW1;

public class HardwareConnection {
    public static HardwareConnection getInstance() {
        if (instance == null) {
            instance = new HardwareConnection();
            instance.connect(); // chỉ gọi 1 lần duy nhất
        }
        return instance;
    }

    public static HardwareConnection instance;
    public void connect(){
        System.out.println("COnnect");
    }
    public void disconnect(){
        System.out.println("Disconnect");
    }
}
