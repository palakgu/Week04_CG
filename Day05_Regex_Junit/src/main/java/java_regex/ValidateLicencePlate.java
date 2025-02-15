package java_regex;

import java.util.regex.Pattern;

public class ValidateLicencePlate {
    public static void main(String[] args) {
        String[] text = {"AB1234", "A12345", "US1234"};
        String regex = "^[A-Z]{2}[0-9]{4}";
        for (String name : text) {
            System.out.println(name + " Is valid : " + validate(name, regex));
        }
    }
    public static boolean  validate(String name , String regex){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(name).matches();

    }
}
