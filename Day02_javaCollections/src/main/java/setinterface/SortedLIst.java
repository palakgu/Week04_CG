package setinterface;

import java.util.*;

public class SortedLIst {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(4,6,3));
        TreeSet<Integer> set2 =  new TreeSet<>(set1);

        System.out.println(sortedList(set2));
    }
    public  static List<Integer> sortedList(TreeSet<Integer> set2){
        return new ArrayList<>(set2);
    }
}
