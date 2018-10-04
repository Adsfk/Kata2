package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
   
    public static void main(String[] args) {
        int[] array = {1,2,1,3,4,1,5,2,4,3,1,7,1,2,4,5,3};
        Histogram histo = new Histogram(array);
        Map<Integer,Integer> histogr = histo.getHistogram();
        Iterator<Map.Entry<Integer, Integer>> it = histogr.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer,Integer> entry = it.next();
            System.out.println(entry.getKey()+" ==> "+ entry.getValue());
        }
    }
    
}
