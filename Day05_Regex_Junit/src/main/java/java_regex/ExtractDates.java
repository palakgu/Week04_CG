package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String input = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}|\\b\\d{2}.\\d{2}.\\d{4}|\\b\\d{2}-\\d{2}-\\d{4}";
        System.out.println(" The Extracted Dates are : "+ extractDates(input , regex));
    }
    public static String extractDates(String input , String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            sb.append(matcher.group()).append(", ");
        }
        return sb.toString().trim();
    }
}
