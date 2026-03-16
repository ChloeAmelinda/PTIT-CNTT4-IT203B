package Session7.HW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Customer customer = new Customer("a","AA","a@gmail.com");
        System.out.println("Đã thêm khách hàng");
        Product p = new Product(1, "A",1000);
        System.out.println("Đã thêm sản phẩm " + p.ProductId);
        Order o = new Order("o1",customer, Arrays.asList(p));
        System.out.println("Đơn hàng "+o.OrderId + "  được tạo");

        OrderCalculator calculator = new OrderCalculator();
        o.total = calculator.sum(o);
        System.out.println("total: "+o.total);

        OrderRespository res = new OrderRespository();
        res.save(o);

        EmailService emailService = new EmailService();
        emailService.send(customer);
    }
}
