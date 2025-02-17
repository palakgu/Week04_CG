package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        String input = "Contact us at support@example.com and info@company.org";
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        System.out.println(" Email Id :  "+ extractEmail(input , regex));
    }
    public static String extractEmail(String input , String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            sb.append(matcher.group()).append(" ");
        }
        return sb.toString();
    }
}
