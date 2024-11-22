

abstract class Figure {
    final static double PI = 3.1420;
    double r, a, v;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}

class Cone extends Figure {
    double n, s;

    public void calcArea() {
        a = (2*PI*r*s);
    }
    public void calcVol() {
        v = (PI*r*s)/3;
    }
    public void DispArea() {
        System.out.println("Cone Area: " + a);
    }
    public void Dispvol() {
        System.out.println("Cone volume: " + v);
    }
}

class Sphere extends Figure {
    
    public void calcArea() {
        a = (4*PI*r*r);
    }
    public void calcVol() {
        v = (4*PI*r*r*r)/3;
    }
    public void DispArea() {
        System.out.println("Sphere Area: " + a);
    }
    public void Dispvol() {
        System.out.println("Sphere volume: " + v);
    }
}

class Cylinder extends Figure {
    double h;

    public void calcArea() {
        a = (2*PI*r*h);
    }
    public void calcVol() {
        v = (PI*r*r*h);
    }
    public void DispArea() {
        System.out.println("Cylunder Area: " + a);
    }
    public void Dispvol() {
        System.out.println("Cylinder volume: " + v);
    }
}


public class L3_Q4 {
    public static void main(String[] args) {
        Cone c = new Cone();
        c.r = 7;
        c.s = 10;
        c.calcArea();
        c.DispArea();
        c.calcVol();
        c.Dispvol();

        Sphere s = new Sphere();
        s.r = 14;
        s.calcArea();
        s.DispArea();
        s.calcVol();
        s.Dispvol();

        Cylinder cy = new Cylinder();
        cy.r = 3.5;
        cy.h = 21;
        cy.calcArea();
        cy.DispArea();
        cy.calcVol();
        cy.Dispvol();
    }
}