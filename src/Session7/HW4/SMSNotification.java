package Session7.HW4;

class SMSNotification implements NotificationService {

    public void send(String message, String recipient){
        System.out.println("Gửi SMS tới " + recipient);
    }
}
