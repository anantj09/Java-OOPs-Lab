

class Product {

    int ProductID;
    String Name;
    int CategoryID;
    int UnitPrice;

    public Product(int id,String name,int cid,int price)
    {
        this.ProductID=id;
        this.Name=name;
        this.CategoryID=cid;
        this.UnitPrice=price;
    }
    public void setUnitPrice(int price){
        this.UnitPrice=price;
    }
    public int getUnitPrice(){
        return UnitPrice;
    }

}

class ElectricalProduct extends Product{

    String Voltage;
    int watt;

    public ElectricalProduct(int id,String name,int cid,int price,String voltage,int watt){

        super(id, name, cid, price); 
        this.Voltage = voltage; 
        this.watt = watt;
    }
    
    public void changeWattAndPrice(int watt,int price){

        this.watt=watt;
        setUnitPrice(price);
    }
    public void Display()
    {
        System.out.println("Product ID: " + ProductID);
        System.out.println("Name: " + Name);
        System.out.println("Category ID: " + CategoryID);
        System.out.println("Unit Price: " + getUnitPrice());
        System.out.println("Voltage Range: " + Voltage);
        System.out.println("Wattage: " + watt);

    }
}

public class L5_Q3 {
    public static void main(String[] args) {
        
    

    ElectricalProduct ep = new ElectricalProduct(1, "Electric Kettle", 101, 1500, "220V - 240V", 1500); 
    System.out.println("Before Update:"); 
    ep.Display(); 
    ep.changeWattAndPrice(2000, 1800); 
    System.out.println("\nAfter Update:"); 
    ep.Display();

    }
    
}
