package smartparking;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter name:");
            String name = input.nextLine();

            System.out.println("Enter ID:");
            String id = input.nextLine();

            System.out.println("Enter plate number:");
            String plate = input.nextLine();

            System.out.println("Enter ticket number:");
            int ticketNumber = input.nextInt();

            System.out.println("Enter hours:");
            int hours = input.nextInt();

            ParkingLot lot = new ParkingLot(5);
            lot.reserveSlot();

            Ticket ticket = new Ticket(plate, ticketNumber);
            lot.addTicket(ticket);

            double fee = ticket.calculateParkingFee(hours);

            Payment payment = new Payment(name, id);
            payment.displayDetails();
            payment.makePayment(fee);

            // SAVE TO FILE
            FileWriter writer = new FileWriter("parking.txt", true);
            writer.write(name + "," + plate + "," + ticketNumber + "," + fee + "\n");
            writer.close();

            System.out.println("Saved to file.");

            // READ FROM FILE
            File file = new File("parking.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Records in file:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}

