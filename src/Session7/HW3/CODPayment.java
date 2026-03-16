package Session7.HW3;

public class CODPayment implements CODPayable {

    @Override
    public void processCOD(double amount) {

        System.out.println("Thanh toán COD: " + amount);
    }
}