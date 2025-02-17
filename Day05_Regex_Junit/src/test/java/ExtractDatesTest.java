import java_regex.ExtractDates;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExtractDatesTest {
    @Test
    public void extractDated(){
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}|\\b\\d{2}.\\d{2}.\\d{4}|\\b\\d{2}-\\d{2}-\\d{4}";
        String result = "12/05/2023, 15/08/2024, 29/02/2020,";
        Assertions.assertEquals(ExtractDates.extractDates(input , regex),result);
    }
}
