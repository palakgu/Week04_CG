package list_interface.findnthelement;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Find_NthElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,30,25, 50,40);
        int n = 3;
        System.out.println(nthElement(list , n));
    }
    public static int nthElement(List<Integer> list , int n){
        Collections.reverse(list);
        return list.get(n-1);
    }
}
