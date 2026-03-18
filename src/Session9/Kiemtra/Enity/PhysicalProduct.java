package Session9.Kiemtra.Enity;

public class PhysicalProduct extends Product{
    public PhysicalProduct(String id, String name, double price) {
        super(id, name, price);
    }
    public void displayInfo(){
        System.out.printf("id: %s\t,name : %s \t ,price: %f",id,name,price);
    }
}
