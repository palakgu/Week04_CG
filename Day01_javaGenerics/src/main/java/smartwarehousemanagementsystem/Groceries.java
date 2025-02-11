package smartwarehousemanagementsystem;

public class Groceries extends WarehouseItems{
    public Groceries(String name , double price){
        super(name , price);
    }
    public void displayInfo(){
        System.out.println(" The Groceries Item ");
        System.out.println(" Name "+ name );
        System.out.println(" Price "+ price);
    }
}
