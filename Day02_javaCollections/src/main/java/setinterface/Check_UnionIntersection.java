package setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Check_UnionIntersection {
    public static void main(String[] args) {


        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println(" the union " + unionSet(set1, set2));
        System.out.println(" the intersection "+ intersectionSet(set1 ,set2));
    }

    public static HashSet<Integer>unionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> list = new HashSet<>();
        list.addAll(set1);
        list.addAll(set2);
        return list;
    }

    public static List<Integer> intersectionSet(HashSet<Integer> set1 , HashSet<Integer>set2){
        List<Integer> list = new ArrayList<>();
        for(int i : set1){
            if(set2.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
