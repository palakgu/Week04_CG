import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import setinterface.CheckTwoSet;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSet_Test {
    @Test
    void CheckTwoSet(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));
        boolean result = set1.equals(set2);
        Assertions.assertEquals(CheckTwoSet.checkEquality(set1,set2),result);
    }
}
