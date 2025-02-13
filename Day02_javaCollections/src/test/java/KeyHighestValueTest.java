import mapinterface.KeyHighestValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class KeyHighestValueTest {
    @Test
    void KeyHighestValueTest(){
        Map<String, Integer> map = new HashMap<>( Map.of("A" ,10 ,"B" , 20 , "C", 30));
        String result = "C";
        Assertions.assertEquals(KeyHighestValue.findMaxKey(map), result);
    }
}
