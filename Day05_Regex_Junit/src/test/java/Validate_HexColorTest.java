import java_regex.ValidateUserName;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Validate_HexColorTest {
    @Test
    public void validates(){
        String[] text = {"#FFA500", "#ff4500",  "#123"};
        String regex = "^#[0-9A-Za-z]{6}";
        Assertions.assertTrue(ValidateUserName.validate("#FFA500" , regex));
        Assertions.assertTrue(ValidateUserName.validate("#ff4500", regex));
        Assertions.assertFalse(ValidateUserName.validate("#123" , regex));
    }

}
