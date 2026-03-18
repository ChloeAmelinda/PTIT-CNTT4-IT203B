package Session9.Kiemtra;

import Session9.Kiemtra.Database.ProductFactory;
import Session9.Kiemtra.Enity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> productList= new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("1.Them moi san pham");
            System.out.println("2.Xem danh sach san pham");
            System.out.println("3.Cap nhap thong tin san pham");
            System.out.println("4.Xoa san pham");
            System.out.println("5.Thoat");

            System.out.println("Nhap lua chon:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Nhap id");
                    String id = sc.nextLine();

                    System.out.println("Nhap ten");
                    String name = sc.nextLine();

                    System.out.println("Nhap gia :");
                    double price = sc.nextDouble();

                    ProductFactory productFactory = new ProductFactory();
                    Product product = productFactory.createProduct(id, name, price);
                    productList.add(product);
                    break;
                case 2:
                    for (Product p : productList){
                        p.displayInfo();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("Loi");
                    break;
            }
        }while (choice != 5);

    }
}
