import list_interface.findfrequency.Find_Frequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Frequency_Test {
    @Test
            void frequencyTest() {
        List<String> list = Arrays.asList(" Apple", "Banana", "Apple", "Papaya");
        Map<String, Integer> expected = Find_Frequency.findFrequency(list);
        Assertions.assertEquals(Find_Frequency.findFrequency(list), expected);
    }
}
