package Session6.HW5;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TicketPool roomA = new TicketPool("A", 5);
        TicketPool roomB = new TicketPool("B", 6);
        TicketPool roomC = new TicketPool("C", 4);

        List<TicketPool> pools =
                List.of(roomA, roomB, roomC);

        for (int i = 1; i <= 5; i++) {

            new Thread(
                    new BookingCounter("Quầy " + i, roomA)
            ).start();
        }

        new Thread(
                new TimeoutManager(pools)
        ).start();
    }
}