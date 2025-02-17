package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWord {
    public static void main(String[] args) {
        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z][a-zA-Z]+";
        System.out.println(" The Captial word from input is "+ capitalWord(input , regex));
    }
    public static String capitalWord(String input , String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            sb.append(matcher.group()).append(", ");
        }
        return  sb.toString().trim();
        }
    }

