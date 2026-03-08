package Session1.HW4;

import java.io.IOException;

public class main {
    public static void SaveToFile() throws IOException{
        System.out.println("dang xu li file");
        System.out.println("Loi ghi du lieu vao file");
    }
    public static void processUserData() throws IOException{
        System.out.println("dang xu li data");
        SaveToFile();
    }

    static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
