package Session6.HW5;

import java.util.Random;

public class BookingCounter implements Runnable {

    private String name;
    private TicketPool pool;

    Random random = new Random();

    public BookingCounter(String name, TicketPool pool) {
        this.name = name;
        this.pool = pool;
    }

    @Override
    public void run() {

        while (true) {

            boolean vip = random.nextBoolean();

            Ticket ticket = pool.holdTicket(vip);

            if (ticket != null) {

                System.out.println(
                        name + ": Đã giữ vé "
                                + ticket.getTicketId()
                                + (vip ? " (VIP)" : "")
                                + ". Thanh toán trong 5s"
                );

                try {
                    Thread.sleep(3000);
                } catch (Exception e) {}

                boolean success = pool.sellHeldTicket(ticket);

                if (success) {

                    System.out.println(
                            name + ": Thanh toán thành công "
                                    + ticket.getTicketId()
                    );
                }

            } else {

                System.out.println(name + ": Không còn vé");
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}