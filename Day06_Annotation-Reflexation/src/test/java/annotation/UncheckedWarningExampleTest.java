package annotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UncheckedWarningExampleTest {
    @Test
    @SuppressWarnings("unchecked")
    void testArrayListRawType() {
        ArrayList list = new ArrayList<>();
        list.add("Test");
        list.add(123);


        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals("Test", list.get(0));
        Assertions.assertEquals(123, list.get(1));
    }
}
