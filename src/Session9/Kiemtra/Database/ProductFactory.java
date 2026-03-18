package Session9.Kiemtra.Database;

import Session9.Kiemtra.Enity.Product;

public class ProductFactory {
    public Product createProduct(String id, String name, double price) {
        return new Product(id, name, price);
    }
}
