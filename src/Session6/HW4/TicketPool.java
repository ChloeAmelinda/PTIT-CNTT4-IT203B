package Session6.HW4;

import Session6.HW1.Ticket;

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

        while (true) {

            for (Ticket t : tickets) {

                if (!t.isSold()) {

                    t.setSold(true);
                    return t;
                }
            }

            try {

                System.out.println("Hết vé phòng " + roomName + ", đang chờ...");
                wait(); // chờ khi hết vé

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void addTickets(int count) {

        int start = tickets.size() + 1;

        for (int i = 0; i < count; i++) {

            String id = roomName + "-" + String.format("%03d", start + i);
            tickets.add(new Ticket(id, roomName));
        }

        System.out.println("Nhà cung cấp: Đã thêm " + count + " vé vào phòng " + roomName);

        notifyAll(); // đánh thức các quầy
    }

    public String getRoomName() {
        return roomName;
    }
}