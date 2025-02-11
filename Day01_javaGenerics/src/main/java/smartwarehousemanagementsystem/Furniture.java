package smartwarehousemanagementsystem;

public class Furniture extends WarehouseItems {
    public Furniture(String name , double price ){
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println(" The Furniture Items ");
        System.out.println(" Name "+ name);
        System.out.println(" Price "+ price);
    }
}
