import list_interface.rotatelist.Rotate_List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Rotated_ListTest {
    @Test
    void rotatedTest(){
        List<Integer> list = Arrays.asList(20,30,40,50);
        int pos = 2;
        List<Integer> expected = Rotate_List.rotateList(list , pos);
        Assertions.assertEquals(Rotate_List.rotateList(list , pos) , expected);
    }
}
