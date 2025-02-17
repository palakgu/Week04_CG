package junit_testing;

import junit.StringUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringUtilsTest {
    String str = "he is good is he";
    @Test
    public void reverse(){
        String res = "eh si doog si eh";
        Assertions.assertEquals(StringUtils.reverse(str),res);
    }
    @Test
    public void isPalindrome(){
        boolean flag = false;
        Assertions.assertEquals(StringUtils.isPalindrome(str),flag);
    }
    @Test
    public void toUppercase(){
        String res = str.toUpperCase();
        Assertions.assertEquals(StringUtils.toUpperCase(str),res);
    }

}
