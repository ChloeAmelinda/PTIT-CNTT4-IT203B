package Session1.HW1;

import java.util.Scanner;

public class bai1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam sinh:");
        String n = sc.nextLine();

        try{
            int birthday = Integer.parseInt(n);
            System.out.println("your age:" + (2026-birthday));
        } catch (NumberFormatException e) {
            System.out.println("loi ");
        }finally {
            System.out.println("thuc hien don dep tai nguyen");
            sc.close();
        }
    }
}
