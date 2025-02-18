package annotation.uncheckedwarning;

import java.util.ArrayList;

public class UncheckedWarningExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(100);
        System.out.println(" Array list "+ list);
    }
}
