import java.util.*;

public class L4_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter beginnning of range: ");
        int a = sc.nextInt();
        System.out.print("Enter ending of range: ");
        int b = sc.nextInt();
        System.out.print("Enter pattern to be found: ");
        int p = sc.nextInt();
        String pattern = Integer.toString(p);

        System.out.println("Pattern are in follows: ");
        for(int i=a; i<=b; i++) {
            String k = Integer.toString(i);
            if (k.indexOf(pattern) != -1) {
                System.out.print(k + " ");
            }
        }
    }
}
