package Session7.HW1;

import java.util.List;

public class Order {
    String OrderId;
    Customer Customer;
    List<Product> listOrder;
    double total;

    public Order(String orderId, Customer Customer, List<Product> listOrder) {
        this.OrderId = orderId;
        this.Customer = Customer;
        this.listOrder = listOrder;
        this.total = total;
    }



}

