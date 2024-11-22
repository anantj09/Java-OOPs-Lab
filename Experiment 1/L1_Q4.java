import java.util.*;

public class L1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        System.out.print("Enter radius of circle: ");
        c1.r = sc.nextInt();
        
        System.out.println("Diameter: " + c1.diameter());
        System.out.println("Circumference: " + c1.Circumference());
        System.out.println("Area: " + c1.area());
    }
}

class Circle {
    int r;

    int diameter() {
        return (2*r);
    }
    float Circumference() {
        return (float) (2*r*Math.PI);
    }
    float area() {
        return (float) (r*r*Math.PI);
    }
}