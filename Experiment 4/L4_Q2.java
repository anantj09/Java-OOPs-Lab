import java.util.*;

public class L4_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");

        CheckPwd pass = new CheckPwd();
        pass.pwd = sc.nextLine();
        pass.counting();
        pass.checking();
        pass.pattern();
        if (pass.correct) {
            System.out.println("Pasword is correct");
        }
        else {
            System.out.println("Password is incorrect");
        }
    }
}

class CheckPwd {
    String pwd;
    int lcount=0, ucount=0, scount=0, dcount=0;
    boolean correct = true;

    void counting() {
        for (int i=0; i<pwd.length(); i++) {
            int k = (int) pwd.charAt(i);
            if (k >= 65 && k <= 90) {
                ucount++;
            }
            else if (k >= 97 && k <= 122) {
                lcount++;
            }
            else if (k >= 48 && k <= 57) {
                dcount++;
            }
            else {
                scount++;
            }
        }
    }

    void checking() {
        int l = pwd.length();
        if (lcount == 0 || ucount!=0 || dcount==0 || scount!=0 || (l<=5 && l>=12)) {
            correct = false;
        }
        return;
    }


    void pattern() {
        for (int i=1; i<pwd.length(); i++) {
            if ((pwd.charAt(i-1)) == (pwd.charAt(i))) {
                correct = false;
            }
        }
        for (int i=2; i<pwd.length()-1; i++) {
            if ((pwd.charAt(i-2)+pwd.charAt(i-1)) == (pwd.charAt(i)+pwd.charAt(i+1))) {
                correct = false;
            }
        }
    }
}
