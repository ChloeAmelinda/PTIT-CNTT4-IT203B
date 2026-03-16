package Session7.HW3;

public class PaymentProcessor {

    public void processPayment(Object payment, double amount){

        if(payment instanceof CODPayable){
            ((CODPayable) payment).processCOD(amount);
        }

        if(payment instanceof CardPayable){
            ((CardPayable) payment).processCard(amount);
        }

        if(payment instanceof EWalletPayable){
            ((EWalletPayable) payment).processEWallet(amount);
        }

    }
}