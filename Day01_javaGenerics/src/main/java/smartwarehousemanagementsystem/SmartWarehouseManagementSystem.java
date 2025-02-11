package smartwarehousemanagementsystem;

import static smartwarehousemanagementsystem.Utility.displayAllItems;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        WarehouseItems laptop = new Electronics("MSI" , 500000.0);
        WarehouseItems Apple = new Groceries("Apple" , 250);
        WarehouseItems chair = new Furniture("Chair" , 5000);

        Storage<WarehouseItems> warehouseItemsStorage = new Storage<>();

       warehouseItemsStorage.addItem(laptop);
       warehouseItemsStorage.addItem(Apple);
       warehouseItemsStorage.addItem(chair);
        displayAllItems(warehouseItemsStorage.getItem());

    }
}
