import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.Check_UnionIntersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Check_UnionIntersectionTest {
    @Test
    void checkunion(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        HashSet<Integer> result = Check_UnionIntersection.unionSet(set1 ,set2);
        Assertions.assertEquals(Check_UnionIntersection.unionSet(set1 ,set2) , result);
    }
    @Test
     void checkINtersection(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        List<Integer> result = Check_UnionIntersection.intersectionSet(set1 ,set2);
        Assertions.assertEquals(Check_UnionIntersection.intersectionSet(set1 ,set2) , result);

    }
}
