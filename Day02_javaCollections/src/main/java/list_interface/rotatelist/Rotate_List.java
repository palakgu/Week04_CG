package list_interface.rotatelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate_List {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,30,40,50);
        int pos = 2;
        System.out.println(" List before rotation \n"+ list);
        System.out.println(" After rotation");
        System.out.println(rotateList(list , pos));
    }
    public static List<Integer> rotateList(List<Integer> list , int pos){
        List<Integer> rotated = new ArrayList<>( list.subList(pos , list.size()));
        rotated.addAll(list.subList(0 ,pos)) ;
        return rotated;
    }
}
