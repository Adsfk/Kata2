package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
   
    public static void main(String[] args) {
        int[] array = {1,2,1,3,4,1,5,2,4,3,1,7,1,2,4,5,3};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i : array) {
            histogram.put(i, histogram.containsKey(i)? histogram.get(i)+1:1);
        }
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey()+" ==> "+ entry.getValue());
        }
    }
    
}
