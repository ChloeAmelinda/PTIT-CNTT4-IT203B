package Session7.HW1;

public class OrderCalculator {
    double sum(Order order){
        double total = 0;
        for (Product p : order.listOrder){
            total += p.Price;
        }
        return total;
    }
}
