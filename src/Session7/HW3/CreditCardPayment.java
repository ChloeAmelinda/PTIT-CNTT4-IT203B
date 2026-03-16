package Session7.HW3;

public class CreditCardPayment implements CardPayable {

    @Override
    public void processCard(double amount) {

        System.out.println("Thanh toán Credit Card: " + amount);
    }
}