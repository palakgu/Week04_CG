import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.SortedLIst;

import java.util.*;

public class SortedSetTest {
    @Test
    void sortedSet(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(4,6,3));
        TreeSet<Integer> set2 =  new TreeSet<>(set1);
        List<Integer> result = new ArrayList<>(set2);
        Assertions.assertEquals(SortedLIst.sortedList(set2) , result);

    }
}
