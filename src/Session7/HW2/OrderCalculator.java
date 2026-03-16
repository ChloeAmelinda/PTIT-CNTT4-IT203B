package Session7.HW2;

public class OrderCalculator {

    DiscountStrategy discountStrategy;

    public OrderCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculate(double totalAmount) {

        return discountStrategy.applyDiscount(totalAmount);
    }
}