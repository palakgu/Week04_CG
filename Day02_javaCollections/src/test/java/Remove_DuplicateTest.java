import list_interface.removeduplicate.Remove_Duplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_DuplicateTest {
    @Test
    void removeDuplicate(){
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 5, 6, 8, 9, 8);
        LinkedHashSet<Integer> expected = Remove_Duplicate.removeDuplicate(list);
        Assertions.assertEquals(Remove_Duplicate.removeDuplicate(list),expected);

    }
}
