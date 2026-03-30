package smartparking;

import java.util.ArrayList;

public class ParkingLot implements Reservable {

    private int totalSlots;
    private ArrayList<Ticket> tickets;

    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        tickets = new ArrayList<>();
    }

    @Override
    public void reserveSlot() {
        if (totalSlots > 0) {
            totalSlots--;
            System.out.println("Slot reserved successfully.");
        } else {
            System.out.println("No slots available.");
        }
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void showTickets() {
        for (Ticket t : tickets) {
            System.out.println("Plate: " + t.getPlateNumber() +
                               " Ticket: " + t.getTicketNumber());
        }
    }
}