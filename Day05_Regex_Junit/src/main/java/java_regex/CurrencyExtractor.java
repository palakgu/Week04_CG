package java_regex;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExtractor {
    public static List<String> extractCurrencyValues(String text) {
        List<String> values = new ArrayList<>();
        if (text == null) {
            return values;
        }
        String regex = "\\$\\d+\\.\\d{2}|\\b\\d+\\.\\d{2}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }

    public static void main(String[] args) {
        String sampleText = "The price is $45.99, and the discount is 10.50.";
        List<String> values = extractCurrencyValues(sampleText);

        for (String value : values) {
            System.out.println(value);
        }
    }
}