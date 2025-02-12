package list_interface.reversea_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reverse_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("Element in array list before reversing "+ list);

        System.out.println(" Elements in Array list after reversing "+ reverselist(list));
        System.out.println("Element in Linked  list before reversing "+ list1);

        System.out.println(" Elements in Linked list after reversing "+ reverselist1(list1));
    }
    public static ArrayList<Integer> reverselist(List<Integer> list){
        ArrayList<Integer> reverse = new ArrayList<>();
        for(int i=list.size()-1 ;i>=0;i--){
            reverse.add(list.get(i));
        }
        return reverse;
    }
    public static LinkedList<Integer> reverselist1(List<Integer> list){
        LinkedList<Integer> reverse = new LinkedList<>();
        for(int i=list.size()-1 ;i>=0;i--){
            reverse.add(list.get(i));
        }
        return reverse;
    }
}
