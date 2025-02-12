package setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Symmetric_Difference {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println(symmetricDifference(set1 ,set2));
    }

    public static HashSet<Integer> symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> list = new HashSet<>();
        for(int i : set1){
            if(!set2.contains(i)){
                list.add(i);
            }
        }
        for(int i : set2){
            if(!set1.contains(i)){
                list.add(i);
            }
        }
        return list;
    }

}
