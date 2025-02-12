import list_interface.reversea_list.Reverse_List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Reverse_Test {
    @Test
    void reverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assertions.assertEquals(Arrays.asList(4, 3, 2, 1), Reverse_List.reverselist1(list));
    }

    @Test
    void reverseArrayList() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        Assertions.assertEquals(Arrays.asList(4, 3, 2, 1), Reverse_List.reverselist(list1));
    }
}