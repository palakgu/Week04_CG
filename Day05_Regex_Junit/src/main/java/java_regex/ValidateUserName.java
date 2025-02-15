package java_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {
        String[] text = {"user_123", "123user","us"};
        String regex = "^[a-zA-z][a-zA-Z0-9_]{4,14}";
        for(String name : text) {
            System.out.println( name + " Is valid : "+  validate(name, regex));
        }
    }
    public static boolean  validate(String name , String regex){
        Pattern pattern = Pattern.compile(regex);
            return pattern.matcher(name).matches();

    }
}
