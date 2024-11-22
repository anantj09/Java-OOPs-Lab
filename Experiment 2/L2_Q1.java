import java.util.*;

public class L2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CostReduction costreduce = new CostReduction();
        System.out.print("Enter total miles driven per day: ");
        costreduce.miles = sc.nextInt();
        System.out.print("Enter cost per gallons of gasoline: ");
        costreduce.costG = sc.nextInt();
        System.out.print("Enter average fees per day: ");
        costreduce.avgF = sc.nextInt();
        System.out.print("Enter tolls per day: ");
        costreduce.tolls = sc.nextInt();

        System.out.println("Daily driving cost = " + costreduce.drivingCost());
    }
}

class CostReduction {
    int miles, costG, avgF, tolls;

    int drivingCost() {
        int driveCost = (miles*costG)+(avgF*tolls);
        return driveCost;
    }
}