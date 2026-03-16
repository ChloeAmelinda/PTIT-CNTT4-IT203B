package Session6.HW4;

public class Main {

    public static void main(String[] args) {

        TicketPool roomA = new TicketPool("A", 5);
        TicketPool roomB = new TicketPool("B", 5);

        BookingCounter counter1 =
                new BookingCounter("Quầy 1", roomA, roomB);

        BookingCounter counter2 =
                new BookingCounter("Quầy 2", roomA, roomB);

        TicketSupplier supplier =
                new TicketSupplier(roomA, roomB, 3, 5000, 3);

        new Thread(counter1).start();
        new Thread(counter2).start();
        new Thread(supplier).start();
    }
}