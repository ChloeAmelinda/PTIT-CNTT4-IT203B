package Session9.Kiemtra.Database;

import Session9.Kiemtra.Enity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    List<Product> products = new ArrayList<>();

    private static ProductDatabase instance;

    public ProductDatabase() {
        System.out.println("connect database");    }

    public  static ProductDatabase getInstance(){
        if (instance == null){
            instance = new ProductDatabase();
        }
        return  instance;
    }

}
