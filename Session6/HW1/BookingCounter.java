package Session6.HW1;

import java.util.Random;

public class BookingCounter implements Runnable {

    private String counterName;
    private TicketPool roomA;
    private TicketPool roomB;
    private int soldCount = 0;

    Random random = new Random();

    public BookingCounter(String counterName, TicketPool roomA, TicketPool roomB) {
        this.counterName = counterName;
        this.roomA = roomA;
        this.roomB = roomB;
    }

    public int getSoldCount() {
        return soldCount;
    }

    @Override
    public void run() {

        while (true) {

            Ticket ticket;

            if (random.nextBoolean()) {

                ticket = roomA.sellTicket();

                if (ticket != null) {

                    System.out.println(counterName + " bán vé phòng A");
                    System.out.println(counterName + " đã bán vé " + ticket.getTicketId());

                    soldCount++;

                } else {

                    ticket = roomB.sellTicket();

                    if (ticket != null) {

                        System.out.println(counterName + " bán vé phòng B");
                        System.out.println(counterName + " đã bán vé " + ticket.getTicketId());

                        soldCount++;
                    }
                }

            } else {

                ticket = roomB.sellTicket();

                if (ticket != null) {

                    System.out.println(counterName + " bán vé phòng B");
                    System.out.println(counterName + " đã bán vé " + ticket.getTicketId());

                    soldCount++;

                } else {

                    ticket = roomA.sellTicket();

                    if (ticket != null) {

                        System.out.println(counterName + " bán vé phòng A");
                        System.out.println(counterName + " đã bán vé " + ticket.getTicketId());

                        soldCount++;
                    }
                }
            }

            if (roomA.remainingTickets() == 0 && roomB.remainingTickets() == 0) {
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}