package setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubset {
    public static void main(String[] args) {
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,6,3));
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(4,5,2,6,3));
        System.out.println(subset(set1,set2));
    }
    public static boolean subset(HashSet<Integer> set1 , HashSet<Integer>set2){
        boolean isSubset = set2.containsAll(set1) ;
         boolean isSubset1 = set1.containsAll(set2);
         if(isSubset ==true  || isSubset1== true){
             return true;
         }
        return false;
    }
}