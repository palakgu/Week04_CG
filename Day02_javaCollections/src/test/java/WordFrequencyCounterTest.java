import mapinterface.WordFrequencyCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class WordFrequencyCounterTest {
    @Test
    void frequency(){
        String text = "Hello world, hello Java!";
        Map<String , Integer> result = WordFrequencyCounter.countword(text);
        Assertions.assertEquals(WordFrequencyCounter.countword(text) , result);
    }
}
