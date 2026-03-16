package Session7.HW4;

public class Main {

    public static void main(String[] args) {

        OrderRepository repo = new FileOrderRepository();
        NotificationService notify = new EmailService();

        OrderService service = new OrderService(repo, notify);

        service.createOrder(new Order("O1"));
    }
}
