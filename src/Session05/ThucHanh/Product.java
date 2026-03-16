package Session05.ThucHanh;

public class Product {
    int id;
    String name;
    double price;
    int quantity;
    String category;

    public Product(int id , String name , double price , int quantity , String category) {
        this.id = id;
        this.name = name;
        this.price= price;
        this.category = category;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
