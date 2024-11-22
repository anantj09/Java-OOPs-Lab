import java.util.*;

public class L4_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PerfectString s1 = new PerfectString();
        System.out.print("Enter string: ");
        s1.str = sc.nextLine();
        s1.check();

        if(s1.isPerfect) {
            System.out.println("Perfect String");
        }
        else {
            System.out.println("Not a perfect string");
        }
    }
}

class PerfectString {
    String str;
    boolean isPerfect = true;

    void check() {
        int arr[] = new int[256];
        for (int i=0; i<str.length(); i++) {
            int k = (int) str.charAt(i);
            arr[k]++;
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 1) {
                isPerfect = false;
                return;
            }
        }
    }
}