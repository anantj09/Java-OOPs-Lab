import java.util.*;

public class L2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Invoice i1 = new Invoice();

        System.out.print("Enter part number: ");
        String pn = sc.nextLine();
        System.out.print("Enter description: ");
        String d = sc.nextLine();
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();
        System.out.print("Enter price of the product: ");
        double p = sc.nextDouble();
        i1.setpart(pn);
        i1.setdesc(d);
        i1.setquan(q);
        i1.setprice(p);

        System.out.println("Invoice amount = " + i1.getInvoiceAmount());
    }
}

class Invoice {
    String partNumber;
    String description;
    int quantity;
    double price;

    void setpart(String partNumber) {
        this.partNumber = partNumber;
    }
    void setdesc(String description) {
        this.description = description;
    }
    void setquan(int quantity) {
        this.quantity = quantity;
    }
    void setprice(double price) {
        this.price = price;
    }

    double getInvoiceAmount() {
        if (this.quantity < 0) {
            quantity = 0;
        }
        if (this.price < 0) {
            price = 0.0;
        }
        return (quantity * price);
    }
}