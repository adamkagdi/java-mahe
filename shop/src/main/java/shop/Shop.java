package shop;

class Product{
    int pid;
    String pname;
    double pprice;
    double pqty;
    // start of method
    double pamount;
    void pdiscount(double dis){
        System.out.println("The total after 10% is: " + (pamount - (pamount * dis/100)));
    }
}

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.pid = 111;
        p1.pname = "Wrench";
        p1.pprice = 12.5;
        p1.pqty = 100;
        p1.pamount=34.5;
        //using the method below
        p1.pdiscount(10);
    }
}