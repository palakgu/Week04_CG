import list_interface.findnthelement.Find_NthElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NthELementTest {
    @Test
    void nthElementTest(){
        List<Integer> list = Arrays.asList(25,30,40,50,20);
        int n =3;
        int res = Find_NthElement.nthElement(list ,n);
        Assertions.assertEquals(Find_NthElement.nthElement(list ,n) , res);
    }
}
