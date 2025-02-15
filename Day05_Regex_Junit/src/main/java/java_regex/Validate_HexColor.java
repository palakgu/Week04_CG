package java_regex;

import java.util.regex.Pattern;

public class Validate_HexColor {
    public static void main(String[] args) {
        String[] text = {"#FFA500", "#ff4500",  "#123"};
        String regex = "^#[0-9A-Za-z]{6}";
        for (String name : text) {
            System.out.println(name + " Is valid : " + validate(name, regex));
        }
    }
    public static boolean  validate(String name , String regex){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(name).matches();

    }
}
