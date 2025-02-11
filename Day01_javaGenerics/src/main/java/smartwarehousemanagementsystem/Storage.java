package smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage < T extends WarehouseItems>{
    List<T> items ;
    public Storage(){
        items = new ArrayList<>();
    }
    public void addItem(T item){
        items.add(item);
    }
    public List<T> getItem(){
        return items;
    }
}
