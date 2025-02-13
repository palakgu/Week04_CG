import mapinterface.InvertMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertedMapTest {
    @Test
    void invertedTest(){
        Map<Character, Integer> map = new HashMap<>(Map.of('A', 1, 'B', 2, 'C', 1));
        Map<Integer, List<Character>> mapInvert = InvertMap.invertMap(map);
        Assertions.assertEquals(InvertMap.invertMap(map) , mapInvert);

    }
}
