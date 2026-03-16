package Session7.HW4;


class FileOrderRepository implements OrderRepository {

    public void save(Order order){
        System.out.println("Lưu đơn vào file");
    }

    public void findAll(){
        System.out.println("Đọc danh sách đơn từ file");
    }
}
