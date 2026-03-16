package Session1.HW2;

import java.util.Scanner;

public class bai2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total person:");
        int total = sc.nextInt();

        System.out.println("total group:");
        int group = sc.nextInt();

        try{
            int result = total/group;
            System.out.println("result :" +result);
        } catch (ArithmeticException e) {
            System.out.println("No divide 0");
        }

    }
}
