package smartparking;

public class ParkingLot implements Reservable {
     
    private int totalSlots;

    
    public ParkingLot(int totalSlots) {
        this.totalSlots = totalSlots;
        
}
 public int getAvailableSlots() {
        return totalSlots;
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
}