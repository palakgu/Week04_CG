package smartwarehousemanagementsystem;
import java.util.*;
public class Utility {
    public static void displayAllItems(List<? extends WarehouseItems>items){
        for(WarehouseItems item : items){
            item.displayInfo();
        }
    }
}
