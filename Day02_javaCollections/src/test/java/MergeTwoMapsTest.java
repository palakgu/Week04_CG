import mapinterface.MergeTwoMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class MergeTwoMapsTest {
    @Test
    void MergeMapTest(){
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);

        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        Map<String , Integer> result = MergeTwoMap.mergeMap(map1 ,map2);
        Assertions.assertEquals(MergeTwoMap.mergeMap(map1,map2) , result);
    }
}
