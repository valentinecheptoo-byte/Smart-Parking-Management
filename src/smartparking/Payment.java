package smartparking;

public class Payment extends Person implements Payable {
    
    public Payment(String name, String id) {
        super(name, id);    // calling person conctructor
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer id: " + id);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of Ksh " + amount + " completed successfully.");
    }
    
}
