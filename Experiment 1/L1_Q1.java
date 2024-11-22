import java.util.*;

public class L1_Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("Enter the first number: "));
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        Calculator c1 = new Calculator();
        System.out.println("Sum: " + c1.sum(a, b));
        System.out.println("Subtraction: " + c1.subtract(a, b));
        System.out.println("Multiplication: " + c1.product(a, b));
        System.out.println("Division: " + c1.division(a, b));
    }
}

class Calculator {
    int sum(int a, int b) {
        return (a+b);
    }
    int subtract(int a, int b) {
        return (a-b);
    }
    int product(int a, int b) {
        return (a*b);
    }
    int division(int a, int b) {
        return (int) (a/b);
    }
}