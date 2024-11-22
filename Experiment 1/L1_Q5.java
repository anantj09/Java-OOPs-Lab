import java.util.*;

public class L1_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DigitSep num = new DigitSep();
        System.out.print("Enter a five digit number: ");
        num.n = sc.nextInt();
        num.seperate();
    }
}

class DigitSep {
    int n;

    void seperate() {
        int rev = 0;
        for (int i=1; i<=5; i++) {
            int temp = n%10;
            rev = rev*10 + temp;
            n = (int) n/10;
        }
        for (int i=1; i<=5; i++) {
            int temp = rev%10;
            rev = (int) rev/10;
            System.out.print(temp + "   ");
        }
    }
}