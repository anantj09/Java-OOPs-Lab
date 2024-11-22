import java.util.*;

class X {
    int i, j;
    
    X(int i, int j) {
        this.i = i;
        this.j = j;
    }
    int finalSum() {
        return i+j;
    }
}
class Y extends X {
    Y(int i, int j) {
        super(i, j);
    }
    int findProduct() {
        return i*j;
    }
}
class Z extends Y {
    Z(int i, int j) {
        super(i, j);
    }
    int difference() {
        return i-j;
    }
}


public class L3_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of i and j: ");
        int i = sc.nextInt();
        int j = sc.nextInt();

        Z z = new Z(i,j);
        System.out.println(z.finalSum());
        System.out.println(z.findProduct());
        System.out.println(z.difference());
    }
}