package Session7.HW4;
class DatabaseOrderRepository implements OrderRepository {

    public void save(Order order){
        System.out.println("Lưu đơn vào database");
    }

    public void findAll(){
        System.out.println("Đọc đơn từ database");
    }
}
