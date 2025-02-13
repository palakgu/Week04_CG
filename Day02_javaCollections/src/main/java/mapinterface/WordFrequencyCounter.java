package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(countword(text));
    }
    public static Map<String , Integer> countword(String text){
        Map<String ,Integer> wordCount = new HashMap<>();
        if(text.length()==0){
            return wordCount;
        }
        text = text.replaceAll("^a-zA-Z" , "").toLowerCase();
        String[] words = text.split("\\s+");
        for ( String word :words){
            wordCount.put(word , wordCount.getOrDefault(word , 0)+1);
        }
        return wordCount;
    }

}
