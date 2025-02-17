import java_regex.ExtractLinks;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExtractLinkTest {
    @Test
    public void extract(){
        String input = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}\\b*";
        String result = "https://www.google.com, http://example.org,";
        Assertions.assertEquals(ExtractLinks.extractLink(input , regex),result);
    }
}
