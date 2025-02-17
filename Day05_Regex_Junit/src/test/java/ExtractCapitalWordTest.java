import java_regex.ExtractCapitalWord;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExtractCapitalWordTest {
    @Test
    public void wordTest() {
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z][a-zA-Z]+";
        String result = "The, Eiffel, Tower, Paris, Statue, Liberty, New, York,";
        Assertions.assertEquals(ExtractCapitalWord.capitalWord(input, regex), result);
    }
}
