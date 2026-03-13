package smartparking;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter customer name:");
            String name = input.nextLine();

            System.out.println("Enter customer ID:");
            String id = input.nextLine();

            System.out.println("Enter vehicle plate number:");
            String plate = input.nextLine();

            System.out.println("Enter ticket number:");
            int ticketNumber = input.nextInt();

            System.out.println("Enter hours parked:");
            int hours = input.nextInt();

            ParkingLot lot = new ParkingLot(5);
            lot.reserveSlot();

            Ticket ticket = new Ticket(plate, ticketNumber);
            double fee = ticket.calculateParkingFee(hours);

            Payment payment = new Payment(name, id);

            payment.displayDetails();
            payment.makePayment(fee);

            System.out.println("Plate Number: " + ticket.getPlateNumber());
            System.out.println("Ticket Number: " + ticket.getTicketNumber());

        } catch (Exception e) {

            System.out.println("Invalid input. Please enter the correct data.");

        } finally {

            System.out.println("Program finished.");

        }

        input.close();
    }
}

