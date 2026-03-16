package Session6.HW1;

import java.util.ArrayList;
import java.util.List;

public class TicketPool {

    private String roomName;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketPool(String roomName, int totalTickets) {

        this.roomName = roomName;

        for (int i = 1; i <= totalTickets; i++) {

            String id = roomName + "-" + String.format("%03d", i);
            tickets.add(new Ticket(id, roomName));
        }
    }

    public synchronized Ticket sellTicket() {

        for (Ticket t : tickets) {

            if (!t.isSold()) {

                t.setSold(true);
                return t;
            }
        }

        return null;
    }

    public int remainingTickets() {

        int count = 0;

        for (Ticket t : tickets) {
            if (!t.isSold()) {
                count++;
            }
        }

        return count;
    }

    public String getRoomName() {
        return roomName;
    }
    public synchronized void addTickets(int count) {

        int start = tickets.size() + 1;

        for (int i = 0; i < count; i++) {

            String id = roomName + "-" + String.format("%03d", start + i);

            tickets.add(new Ticket(id, roomName));
        }

        System.out.println("Nhà cung cấp: Đã thêm " + count + " vé vào phòng " + roomName);
    }
    public synchronized Ticket takeTicket() {

        for (Ticket t : tickets) {

            if (!t.isSold()) {

                t.setSold(true);
                return t;
            }
        }

        return null;
    }

    public synchronized void returnTicket(Ticket ticket) {

        for (Ticket t : tickets) {

            if (t.getTicketId().equals(ticket.getTicketId())) {

                t.setSold(false);
                return;
            }
        }
    }
}