

class SuperClass {
    SuperClass() {
        System.out.println("Constructor of SuperClass");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super();
        System.out.println("Constructor of SubClass");
    }
}

public class L6_Q1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
    }
}
