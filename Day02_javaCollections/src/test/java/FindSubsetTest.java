import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.FindSubset;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubsetTest {
    @Test
    void subset(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(4,6,3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5,2,6,3));
        boolean res =  set2.containsAll(set1);
        Assertions.assertEquals(FindSubset.subset(set1,set2),res);
    }
}
