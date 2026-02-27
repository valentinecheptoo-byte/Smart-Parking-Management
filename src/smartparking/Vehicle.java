package smartparking;

public abstract class Vehicle {
    protected String plateNumber;
    protected String type;

    public Vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    public abstract double calculateParkingFee(int hours);
    
}
