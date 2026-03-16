package Session7.HW4;
class EmailService implements NotificationService {

    public void send(String message, String recipient){
        System.out.println("Gửi email tới " + recipient);
    }
}
