package Session7.HW3;

public class MomoPayment implements EWalletPayable {

    @Override
    public void processEWallet(double amount) {

        System.out.println("Thanh toán MoMo: " + amount);
    }
}