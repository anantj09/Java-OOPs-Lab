import java.util.*;

public class L2_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        employee e1 = new employee();
        System.out.print("Enter first name of employee 1: ");
        e1.name = sc.nextLine();
        System.out.print("Enter last name of employee 1: ");
        e1.lastName = sc.nextLine();
        System.out.print("Enter employee salary of 1: ");
        e1.monthSalary = sc.nextDouble();

        employee e2 = new employee();
        System.out.print("Enter first name of employee 2: ");
        e2.name = sc.nextLine();
        System.out.print("Enter last name of employee 2: ");
        e2.lastName = sc.nextLine();
        System.out.print("Enter employee salary of 2: ");
        e2.monthSalary = sc.nextDouble();

        System.out.println("Yearly salary of first: " + e1.yearlySalary());
        System.out.println("Yearly salary of second: " + e2.yearlySalary());
        System.out.println("Yearly salary of first(after hike): " + e1.yearlySalaryHike());
        System.out.println("Yearly salary of second(after hike): " + e2.yearlySalaryHike());
    }
}

class employee {
    String name;
    String lastName;
    double monthSalary;

    void getName(String name) {
        this.name = name;
    }
    void getLastname(String lastName) {
        this.lastName = lastName;
    }
    void getSalary(double monthSalary) {
        if (monthSalary < 0) {
            return;
        }
        this.monthSalary = monthSalary;
    }
    double yearlySalary() {
        return monthSalary*12;
    }
    double yearlySalaryHike() {
        return (monthSalary+(monthSalary/10))*12;
    }
}