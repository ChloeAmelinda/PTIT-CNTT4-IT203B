package Session7.HW2;

public class Main {

    public static void main(String[] args) {

        double total = 1000;

        DiscountStrategy percent = new PercentageDiscount(10);
        OrderCalculator calc1 = new OrderCalculator(percent);
        System.out.println("Giảm %: " + calc1.calculate(total));

        DiscountStrategy fixed = new FixedDiscount(100);
        OrderCalculator calc2 = new OrderCalculator(fixed);
        System.out.println("Giảm cố định: " + calc2.calculate(total));

        DiscountStrategy none = new NoDiscount();
        OrderCalculator calc3 = new OrderCalculator(none);
        System.out.println("Không giảm: " + calc3.calculate(total));
    }
}