package smartparking;

public class Main {
    
    public static void main(String[] args) {


        ParkingLot lot = new ParkingLot(5);
        lot.reserveSlot();

        Ticket ticket = new Ticket("KBN123A", 101);
        double fee = ticket.calculateParkingFee(3);

        
        Payment payment = new Payment("Valentine", "ST123");
        payment.displayDetails();
        payment.makePayment(fee);

        System.out.println("Plate Number: " + ticket.getPlateNumber());
        System.out.println("Ticket Number: " + ticket.getTicketNumber());
    }
}
