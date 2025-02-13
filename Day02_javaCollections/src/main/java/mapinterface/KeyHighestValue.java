package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class KeyHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>( Map.of("A" ,10 ,"B" , 20 , "C", 30));
        System.out.println(findMaxKey(map));
    }
    public static String findMaxKey(Map<String, Integer> map){
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<String ,Integer> entry : map.entrySet()){
            if(entry.getValue() >maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
