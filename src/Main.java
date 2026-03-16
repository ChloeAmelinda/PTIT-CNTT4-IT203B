//package KiemTra45P.sessoin5;
//
//import java.util.ArrayList;
//import java.util.Optional;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Product> products = new ArrayList<>();
//
//        while (true) {
//
//            System.out.println("========= PRODUCT MANAGEMENT SYSTEM =========");
//            System.out.println("1. Thêm sản phẩm mới");
//            System.out.println("2. Hiển thị danh sách sản phẩm");
//            System.out.println("3. Cập nhật số lượng theo ID");
//            System.out.println("4. Xóa sản phẩm đã hết hàng");
//            System.out.println("5. Thoát chương trình");
//            System.out.println("=========================================");
//            System.out.print("Your choice: ");
//
//            int choice = sc.nextInt();
//
//            switch(choice){
//                case 1:
//                    System.out.println("Id: ");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//                    boolean exists = products.stream().anyMatch(p -> p.getId() == id);
//
//                    if (exists) {
//                        System.out.println("Id already exists. Please choose a different ID.");
//                        break;
//                    }
//                    System.out.println("Name: ");
//                    String name = sc.nextLine();
//
//                    System.out.println("Price: ");
//                    double price = sc.nextDouble();
//
//                    System.out.println("Quantity: ");
//                    int quantity = sc.nextInt();
//
//                    System.out.println("Category: ");
//                    String category = sc.nextLine();
//
//                    products.add(new Product(id, name, price, quantity, category));
//                    System.out.println("Product added successfully!");
//                    break;
//
//                case 2:
//                    System.out.printf("%-5s %-15s %-10s %-10s\n","ID","Name","Price", "Quantity", "Category");
//                    products.forEach(System.out::println);
//                    break;
//
//                case 3:
//                    System.out.print("Enter ID: ");
//                    int updateId = sc.nextInt();
//
//                    System.out.print("New quantity: ");
//                    int newQuantity = sc.nextInt();
//
//                    Optional<Product> result = products.stream()
//                            .filter(p -> p.getId() == updateId)
//                            .findFirst();
//
//                    if (result.isPresent()) {
//                        result.get().setQuantity(newQuantity);
//                        System.out.println("Updated!");
//                    } else {
//                        System.out.println("Product not found!");
//                    }
//                    break;
//                case 4:
////                    products.removeIf(p -> p.getQuantity() == 0);
//                    System.out.println("Deleted products with quantity = 0");
//                    break;
//
//                case 5:
//                    System.out.println("Exit program!");
//                    return;
//
//                default:
//                    System.out.println("Invalid choice!");
//
//            }
//        }
//    }
////}