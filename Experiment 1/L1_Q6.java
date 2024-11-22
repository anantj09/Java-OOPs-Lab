public class L1_Q6 {
    public static void main(String[] args) {
        SquareCube sqcube = new SquareCube();

        System.out.println("Number   Square   Cube");
        for (int i=1; i<=10; i++) {
            sqcube.n = i;
            sqcube.nsc();
        }
    }
}

class SquareCube {
    int n;

    void nsc() {
        System.out.println(n + "        " + (n*n) + "        " + (n*n*n));
    }
}