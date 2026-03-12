package Session05.ThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("------------------Menu-------------------");
            System.out.println("1.them san pham ");
            System.out.println("2.hien thi san pham ");
            System.out.println("3.cap nhap so luong ");
            System.out.println("4.xoa san pham da het hang ");
            System.out.println("5.thoat chuong trinh");

            System.out.println("lua chon cua ban:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("nhap id:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean exist = products.stream().anyMatch(p-> p.getId() == id);
                    if (exist){
                        System.out.println("trung id");
                        break;
                    }
                    System.out.println("nhap ten :");
                    String name = sc.nextLine();

                    System.out.println("Price: ");
                    double price = sc.nextDouble();

                    System.out.println("Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.println("Category: ");
                    String category = sc.nextLine();

                    products.add(new Product(id, name, price, quantity, category));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    System.out.printf("%-5s %-15s %-10s %-10s\n","ID","Name","Price", "Quantity", "Category");
                    products.forEach(System.out::println);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("nhap sai vui long nhap lai");
                    break;
            }
        }while (choice != 5);
    }
}
