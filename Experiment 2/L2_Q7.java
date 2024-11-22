import java.util.Scanner;

class ParkingGarage {
    public double calculateCharge(double hoursParked) {
        double charge;

        if (hoursParked <= 3) {
            charge = 2.00;
        } else {
            double excessHours = Math.ceil(hoursParked - 3);
            charge = 2.00 + (excessHours * 0.50);

            if (charge > 10.00) {
                charge = 10.00;
            }
        }

        return charge;
    }
}

public class L2_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingGarage garage = new ParkingGarage();
        
        double total = 0.0;
        String continueParking = "";

        do {
            System.out.print("Enter the number of hours parked: ");
            double hoursParked = sc.nextDouble();

            if (hoursParked < 0 || hoursParked > 24) {
                System.out.println("Invalid input.");
                continue;
            }

            double charge = garage.calculateCharge(hoursParked);
            
            System.out.println("Parking charge for this customer: $" + charge);

            total += charge;

            System.out.print("Do you want to enter another customer? (y/n): ");
            continueParking = sc.next();

        } while (continueParking.equalsIgnoreCase("y"));

        System.out.println("\nTotal receipts for parking: $" + total);

    }
}
