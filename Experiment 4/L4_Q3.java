import java.util.*;

public class L4_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        PrintExceeding s = new PrintExceeding();
        s.str = sc.nextLine();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        s.printSubstring(n);
    }
}

class PrintExceeding {
    String str;

    void printSubstring(int n) {
        if (n<str.length()) {
            String sub = str.substring(n);
            System.out.println(sub);
        }
        else {
            System.out.println("Value of n is greater than length of string.");
        }
    }
}