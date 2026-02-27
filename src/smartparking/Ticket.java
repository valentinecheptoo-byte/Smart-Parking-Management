package smartparking;

public class Ticket extends Vehicle{
        private int ticketNumber;

        public Ticket(String plateNumber, int ticketNumber) {
            super(plateNumber);
            this.ticketNumber = ticketNumber;
        }

        public String getTicketNumber() {
            return String.valueOf(this.ticketNumber);
        }

        @Override
        public double calculateParkingFee(int hours) {
            return hours * 100; // 100 per hour
        }

} 

    

