package smartwarehousemanagementsystem;

abstract public class WarehouseItems {
    String name;
    double price ;
    public WarehouseItems(String name , double price){
        this.name = name ;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

   abstract public void displayInfo();
}
