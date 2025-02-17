import java_regex.ExtractEmail;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExtractEmailTest {
    @Test
    public void emailExtract(){
        String input = "Contact us at support@example.com and info@company.org";
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        String result = ExtractEmail.extractEmail(input , regex);
        Assertions.assertEquals(ExtractEmail.extractEmail(input , regex), result);
    }
}
