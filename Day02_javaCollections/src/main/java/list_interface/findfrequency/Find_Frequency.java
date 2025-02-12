package list_interface.findfrequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Find_Frequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Papaya");
        System.out.println(" The frequency of the fruits is" + findFrequency(list));
    }
    public static LinkedHashMap<String , Integer> findFrequency(List<String> list) {
    LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    for(String lists : list){
        map.put(lists , map.getOrDefault(lists ,0)+1);

    }
    return map;
    }
    }

