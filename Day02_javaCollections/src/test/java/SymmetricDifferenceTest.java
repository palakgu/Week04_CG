import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.Symmetric_Difference;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceTest {
    @Test
    void checkDifference(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        HashSet<Integer> result = new HashSet<>(Arrays.asList(1,2,4,5));
        Assertions.assertEquals(Symmetric_Difference.symmetricDifference(set1 ,set2) , result);
    }
}
