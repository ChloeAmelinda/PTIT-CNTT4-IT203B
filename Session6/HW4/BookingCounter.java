package Session6.HW4;

import Session6.HW1.Ticket;

import java.util.Random;

public class BookingCounter implements Runnable {

    private String counterName;
    private TicketPool roomA;
    private TicketPool roomB;

    Random random = new Random();

    public BookingCounter(String counterName, TicketPool roomA, TicketPool roomB) {

        this.counterName = counterName;
        this.roomA = roomA;
        this.roomB = roomB;
    }

    @Override
    public void run() {

        while (true) {

            Ticket ticket;

            if (random.nextBoolean()) {

                ticket = roomA.sellTicket();

                System.out.println(counterName + " bán vé " + ticket.getTicketId());

            } else {

                ticket = roomB.sellTicket();

                System.out.println(counterName + " bán vé " + ticket.getTicketId());
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}