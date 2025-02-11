package smartwarehousemanagementsystem;

public class Electronics extends WarehouseItems {
    public Electronics( String name , Double price) {
        super(name, price);
    }
        @Override
        public void displayInfo(){
            System.out.println("\n===== Electronic Item =====");
            System.out.println(" Name " + name);
            System.out.println(" Price "+ price);

    }
}
