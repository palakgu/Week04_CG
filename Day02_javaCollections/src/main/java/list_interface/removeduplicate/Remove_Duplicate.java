package list_interface.removeduplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,2,3,5,6,8,9,8);
        System.out.println(removeDuplicate(list));
    }
    public static LinkedHashSet<Integer> removeDuplicate(List<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return set;
    }
}
