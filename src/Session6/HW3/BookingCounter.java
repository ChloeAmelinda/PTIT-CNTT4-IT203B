package Session6.HW3;

import Session6.HW1.*;

public class BookingCounter implements Runnable {

    private String counterName;
    private TicketPool roomA;
    private TicketPool roomB;
    private boolean lockAFirst;

    public BookingCounter(String counterName,
                          TicketPool roomA,
                          TicketPool roomB,
                          boolean lockAFirst) {

        this.counterName = counterName;
        this.roomA = roomA;
        this.roomB = roomB;
        this.lockAFirst = lockAFirst;
    }

    public void sellCombo() {

        if (lockAFirst) {

            synchronized (roomA) {

                System.out.println(counterName + ": Đã lấy vé phòng A");

                try { Thread.sleep(200); } catch (Exception e) {}

                synchronized (roomB) {

                    processCombo();
                }
            }

        } else {

            synchronized (roomB) {

                System.out.println(counterName + ": Đã lấy vé phòng B");

                try { Thread.sleep(200); } catch (Exception e) {}

                synchronized (roomA) {

                    processCombo();
                }
            }
        }
    }

    private void processCombo() {

        Ticket ticketA = roomA.takeTicket();
        Ticket ticketB = roomB.takeTicket();

        if (ticketA != null && ticketB != null) {

            System.out.println(counterName + " bán combo thành công: "
                    + ticketA.getTicketId() + " & " + ticketB.getTicketId());

        } else {

            if (ticketA != null) roomA.returnTicket(ticketA);
            if (ticketB != null) roomB.returnTicket(ticketB);

            System.out.println(counterName + " bán combo thất bại");
        }
    }

    @Override
    public void run() {

        while (true) {

            sellCombo();

            try {
                Thread.sleep(300);
            } catch (Exception e) {}
        }
    }
}