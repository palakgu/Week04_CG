import java_regex.ValidateUserName;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ValidateUserNameTest {
    @Test
    public void validates(){
        String[] text = {"user_123", "123user","us"};
        String regex = "^[a-zA-z][a-zA-Z0-9_]{4,14}";
        Assertions.assertTrue(ValidateUserName.validate("user_123" , regex));
        Assertions.assertFalse(ValidateUserName.validate("123user", regex));
        Assertions.assertFalse(ValidateUserName.validate("us" , regex));
    }

}
