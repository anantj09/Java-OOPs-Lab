import java.util.Scanner;

public class L1_Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the first number: "));
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        Larger l = new Larger();
        l.large(a, b);
    }
}

class Larger {
    void large(int x, int y) {
        if (x>y) {
            System.out.println("First is larger.");
        }
        else if (x<y) {
            System.out.println("Second is larger.");
        }
        else {
            System.out.println("Both are equal.");
        }
    }
}