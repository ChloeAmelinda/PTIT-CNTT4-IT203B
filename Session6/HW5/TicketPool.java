package Session6.HW5;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {

    private String roomName;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketPool(String roomName, int capacity) {

        this.roomName = roomName;

        for (int i = 1; i <= capacity; i++) {

            String id = roomName + "-" + String.format("%03d", i);
            tickets.add(new Ticket(id, roomName));
        }
    }

    public synchronized Ticket holdTicket(boolean isVIP) {

        long now = System.currentTimeMillis();

        for (Ticket t : tickets) {

            if (!t.isSold() && !t.isHeld()) {

                t.setHeld(true);
                t.setVIP(isVIP);
                t.setHoldExpiryTime(now + 5000);

                return t;
            }
        }

        return null;
    }

    public synchronized boolean sellHeldTicket(Ticket ticket) {

        if (ticket != null && ticket.isHeld()) {

            ticket.setSold(true);
            ticket.setHeld(false);

            return true;
        }

        return false;
    }

    public synchronized void releaseExpiredTickets() {

        long now = System.currentTimeMillis();

        for (Ticket t : tickets) {

            if (t.isHeld() && now > t.getHoldExpiryTime()) {

                t.setHeld(false);

                System.out.println(
                        "TimeoutManager: Vé "
                                + t.getTicketId()
                                + " hết hạn giữ, đã trả lại kho"
                );
            }
        }
    }
}