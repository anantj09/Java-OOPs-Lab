import java.util.*;

class GasMileage {
    int miles[];
    int gallons[];
    float milesPerGallon;
    float average[];

    GasMileage(int miles[], int gallons[]) {
        this.miles = miles;
        this.gallons = gallons;
        this.average = new float[this.gallons.length];
    }

    void totalAverage() {
        int totalMiles = 0;
        int totalGallons = 0;
        for(int i=0; i<this.miles.length; i++) {
            totalMiles +=miles[i];
        }
        for(int i=0; i<this.gallons.length; i++) {
            totalGallons += gallons[i];
        }
        this.milesPerGallon=(totalMiles/totalGallons);
    }
    
    void eachAvergaeTotal() {
        for(int i=0; i<this.average.length; i++) {
            this.average[i] = (this.miles[i]/this.gallons[i]);
        } 
    }

    void displayAverage(){
        System.out.println("The average number of miles per gallon is " + this.milesPerGallon);
    }

    void displayEach(){
        System.out.println("Avgerage miles per gallon for each trip: ");
        for(int i=0; i<this.average.length; i++){
            System.out.print(this.average[i] + ", ");
        }
        System.out.println();
    }
}


public class L2_Q5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter trips: ");
        int n = sc.nextInt();
        int miles[] = new int[n];
        int gallons[] = new int[n];
        System.out.println("Enter miles in each trip: ");
        for(int i=0; i<miles.length; i++) {
            System.out.print("For Trip " + (i+1) + ": ");
            miles[i] = sc.nextInt();
        }
        System.out.println("Enter gallons for each trip: ");
        for(int i=0; i<gallons.length; i++) {
            System.out.print("For Trip " + (i+1) + ": ");
            gallons[i] = sc.nextInt();
        }

        GasMileage vehicle = new GasMileage(miles, gallons);
        vehicle.totalAverage();
        vehicle.eachAvergaeTotal();
        vehicle.displayAverage();
        vehicle.displayEach();
    }
}
