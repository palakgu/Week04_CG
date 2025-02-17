package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {

        String input = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "\\bhttps?://[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}\\b*";
        System.out.println(" The Urls present are : "+ extractLink(input ,regex));
    }
    public static String extractLink(String input , String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            sb.append(matcher.group()).append(", ");
        }
        return sb.toString().trim();
    }
}
