package setinterface;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6 ));
        System.out.println(checkEquality(set1,set2));
    }
    public static boolean checkEquality(HashSet<Integer> set1 , HashSet<Integer> set2){
        return set1.equals(set2);
    }
}
