import java.util.*;

public class L1_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the first number: "));
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        ThreeNumbers tn = new ThreeNumbers();
        System.out.println(tn.sum(a, b, c));
        System.out.println(tn.avg(a, b, c));
        System.out.println(tn.product(a, b, c));
        tn.largest_smallest(a, b, c);
    }
}

class ThreeNumbers {
    int sum(int x, int y, int z) {
        return (x+y+z);
    }
    float avg(int x, int y, int z) {
        return ((x+y+z)/3);
    }
    int product(int x, int y, int z) {
        return (x*y*z);
    }
    void largest_smallest(int x, int y, int z) {
        if (x>y) {
            if (x>z) {
                System.out.println("First is largest.");
                if (y>z) {
                    System.out.println("Third is smallest.");
                }
                else {
                    System.out.println("Second is smallest.");
                }
            }
            else {
                System.out.println("Third is largest.");
                System.out.println("Second is smallest.");
            }
        }
        else {
            if (y>z) {
                System.out.println("Second is largest.");
                if (x>z) {
                    System.out.println("Third is smallest.");
                }
                else {
                    System.out.println("First is smallest.");
                }
            }
            else {
                System.out.println("Third is largest.");
                System.out.println("First is smallest.");
            }
        }
    }
}