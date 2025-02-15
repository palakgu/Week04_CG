import java_regex.ValidateUserName;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ValidateLicencePlateTest {
    @Test
    public void validates(){
        String[] text = {"AB1234", "A12345", "US1234"};
        String regex = "^[A-Z]{2}[0-9]{4}";
        Assertions.assertTrue(ValidateUserName.validate("AB1234" , regex));
        Assertions.assertFalse(ValidateUserName.validate("A12345", regex));
        Assertions.assertTrue(ValidateUserName.validate("US1234" , regex));
    }

}