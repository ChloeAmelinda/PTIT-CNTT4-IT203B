package Session7.HW4;

class OrderService {

    OrderRepository repository;
    NotificationService notification;

    public OrderService(OrderRepository repository,
                        NotificationService notification){
        this.repository = repository;
        this.notification = notification;
    }

    public void createOrder(Order order){

        repository.save(order);

        notification.send("Đơn hàng đã tạo", "user@gmail.com");
    }
}
