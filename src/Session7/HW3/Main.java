package Session7.HW3;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        CODPayable cod = new CODPayment();
        CardPayable card = new CreditCardPayment();
        EWalletPayable momo = new MomoPayment();

        processor.processPayment(cod, 100);
        processor.processPayment(card, 200);
        processor.processPayment(momo, 300);
    }
}